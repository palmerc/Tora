package jp.co.aiphone.commands;

public class EIW implements Command {

    @Override
    public String getCommand() {
        return "EIW";
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
        return "Entrance Info";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
