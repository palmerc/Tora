package jp.co.aiphone.commands;

public class QLA implements Command {

    @Override
    public String getCommand() {
        return "QLA";
    }

    @Override
    public Direction getDirection() {
        return Direction.IN;
    }

    @Override
    public CommandType getType() {
        return CommandType.RESPONSE;
    }

    @Override
    public String getComment() {
        return "Quick List";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
