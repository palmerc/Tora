package jp.co.aiphone.commands;

public class PS2 implements Command {

    @Override
    public String getCommand() {
        return "PS2";
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
        return "Consecutive reading of AccessCode";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
