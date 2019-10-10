package jp.co.aiphone.commands;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class ITA implements Command {
    int mITAValue = 0;
    boolean mElevatorMode = false;

    public byte[] stringtoBytes(String string) {
        return string.getBytes(StandardCharsets.ISO_8859_1);
    }

    public void setITAValue(int value) {
        this.mITAValue = value;
    }

    public void setElevatorMode(boolean mode) {
        this.mElevatorMode = mode;
    }

    @Override
    public String getCommand() {
        return "ITA";
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
        return "???";
    }

    @Override
    public byte[] serialize() {
        String command = getCommand();

        int byteCount = command.length();
        byteCount += 3;

        ByteBuffer bb = ByteBuffer.allocate(byteCount);
        bb.put(stringtoBytes(command));
        bb.put(((byte)(this.mITAValue >> 8 & 0xFF)));
        bb.put(((byte)(this.mITAValue & 0xFF)));
        bb.put((byte) (this.mElevatorMode ? 1 : 0));

        return bb.array();
    }
}
