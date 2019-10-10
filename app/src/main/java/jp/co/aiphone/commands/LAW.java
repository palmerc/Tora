package jp.co.aiphone.commands;

public class LAW implements Command {

    @Override
    public String getCommand() {
        return "LAW";
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
        return "Lang Mode";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
