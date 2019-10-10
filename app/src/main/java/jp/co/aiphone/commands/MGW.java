package jp.co.aiphone.commands;

public class MGW implements Command {

    @Override
    public String getCommand() {
        return "MGW";
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
        return "Greeting Message";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
