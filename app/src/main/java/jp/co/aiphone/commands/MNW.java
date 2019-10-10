package jp.co.aiphone.commands;

public class MNW implements Command {

    @Override
    public String getCommand() {
        return "MNW";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.WRITE;
    }

    @Override
    public String getComment() {
        return "NfcTagId of Manager";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
