package jp.co.aiphone.commands;

public class LAA implements Command {

    @Override
    public String getCommand() {
        return "LAA";
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
        return "Lang Mode";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
