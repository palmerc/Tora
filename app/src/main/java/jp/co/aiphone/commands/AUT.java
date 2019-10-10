package jp.co.aiphone.commands;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class AUT implements Command {
    private PasscodeType mPasscodeType;
    private String mPasscode = null;

    public AUT(PasscodeType passcodeType, String passcode) {
        this.mPasscodeType = passcodeType;
        this.mPasscode = passcode;
    }


    public byte[] stringToBytes(String string) {
        return string.getBytes(StandardCharsets.ISO_8859_1);
    }

    @Override
    public String getCommand() {
        return "AUT";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.REQUEST;
    }

    @Override
    public String getComment() {
        return "Authentication";
    }

    public String getPasscodeTypeString(PasscodeType type) {
        String text = null;
        switch (type) {
            case ADMIN:
                text = "1";
                break;
            case MANAGER:
                text = "0";
                break;
        }

        return text;
    }

    @Override
    public byte[] serialize() {
        String command = getCommand();
        String passcodeType = getPasscodeTypeString(this.mPasscodeType);
        String passcode = this.mPasscode;

        int byteCount = command.length();
        byteCount += passcodeType.length();
        byteCount += 1;
        byteCount += passcode.length();

        ByteBuffer bb = ByteBuffer.allocate(byteCount);
        bb.put(stringToBytes(command));
        bb.put(stringToBytes(passcodeType));
        bb.put((byte)passcode.length());
        bb.put(stringToBytes(passcode));

        return bb.array();
    }
}
