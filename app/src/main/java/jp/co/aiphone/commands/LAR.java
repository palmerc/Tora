package jp.co.aiphone.commands;

public class LAR implements Command {

    @Override
    public String getCommand() {
        return "LAR";
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
        return "Lang Mode";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
