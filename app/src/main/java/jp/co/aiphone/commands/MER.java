package jp.co.aiphone.commands;

public class MER implements Command {

    @Override
    public String getCommand() {
        return "MER";
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
        return "Mode abnormality";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
