package jp.co.aiphone.commands;

public class NGK implements Command {

    @Override
    public String getCommand() {
        return "NGK";
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
        return "Station Info";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
