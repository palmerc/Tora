package jp.co.aiphone.commands;

public class MR2 implements Command {

    @Override
    public String getCommand() {
        return "MR2";
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
        return "PinCode of Manager";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
