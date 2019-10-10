package jp.co.aiphone.commands;

public class CNW implements Command {

    @Override
    public String getCommand() {
        return "CNW";
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
        return "NfcTagId of Contractor";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
