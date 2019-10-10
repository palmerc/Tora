package jp.co.aiphone.commands;

public class SIW implements Command {

    @Override
    public String getCommand() {
        return "SIW";
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
        return "Self Building Info";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
