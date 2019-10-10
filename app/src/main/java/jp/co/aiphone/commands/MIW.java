package jp.co.aiphone.commands;

public class MIW implements Command {

    @Override
    public String getCommand() {
        return "MIW";
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
        return "GuardStaion Info";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
