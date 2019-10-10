package jp.co.aiphone.commands;

public class SIA implements Command {

    @Override
    public String getCommand() {
        return "SIA";
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
        return "Own building ID";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
