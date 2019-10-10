package jp.co.aiphone.commands;

public class BIW implements Command {

    @Override
    public String getCommand() {
        return "BIW";
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
        return "Building Info";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
