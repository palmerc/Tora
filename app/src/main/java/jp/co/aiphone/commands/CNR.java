package jp.co.aiphone.commands;

public class CNR implements Command {

    @Override
    public String getCommand() {
        return "CNR";
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
        return "NfcTagId of Contractor";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
