package jp.co.aiphone.commands;

public class TMW implements Command {

    @Override
    public String getCommand() {
        return "TMW";
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
        return "Timer";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
