package jp.co.aiphone.commands;

public class MGR implements Command {

    @Override
    public String getCommand() {
        return "MGR";
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
        return "Greeting Message";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
