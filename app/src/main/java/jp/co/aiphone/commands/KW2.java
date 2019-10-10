package jp.co.aiphone.commands;

public class KW2 implements Command {

    @Override
    public String getCommand() {
        return "KW2";
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
        return "AccessCode";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
