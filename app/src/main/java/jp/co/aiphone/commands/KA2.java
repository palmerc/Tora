package jp.co.aiphone.commands;

public class KA2 implements Command {

    @Override
    public String getCommand() {
        return "KA2";
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
        return "AccessCode";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
