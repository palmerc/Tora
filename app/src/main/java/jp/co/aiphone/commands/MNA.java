package jp.co.aiphone.commands;

public class MNA implements Command {

    @Override
    public String getCommand() {
        return "MNA";
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
        return "NfcTagId of Manager";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
