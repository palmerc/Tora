package jp.co.aiphone.commands;

public class JPD implements Command {

    @Override
    public String getCommand() {
        return "JPD";
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
        return "Part of the picture";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
