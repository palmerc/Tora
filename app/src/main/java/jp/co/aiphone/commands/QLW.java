package jp.co.aiphone.commands;

public class QLW implements Command {

    @Override
    public String getCommand() {
        return "QLW";
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
        return "QuickList";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
