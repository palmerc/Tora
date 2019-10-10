package jp.co.aiphone.commands;

public class CNA implements Command {

    @Override
    public String getCommand() {
        return "CNA";
    }

    @Override
    public Direction getDirection() {
        return Direction.IN;
    }

    @Override
    public CommandType getType() {
        return CommandType.RESPONSE;
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
