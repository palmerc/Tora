package jp.co.aiphone.commands;

public class EOK implements Command {

    @Override
    public String getCommand() {
        return "EOK";
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
        return "Writing in completion";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
