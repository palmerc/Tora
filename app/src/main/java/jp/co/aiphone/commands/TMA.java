package jp.co.aiphone.commands;

public class TMA implements Command {

    @Override
    public String getCommand() {
        return "TMA";
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
        return "Timer";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
