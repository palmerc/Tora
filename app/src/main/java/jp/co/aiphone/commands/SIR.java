package jp.co.aiphone.commands;

public class SIR implements Command {

    @Override
    public String getCommand() {
        return "SIR";
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
        return "Own building ID";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
