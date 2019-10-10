package jp.co.aiphone.commands;

public class MWS implements Command {

    @Override
    public String getCommand() {
        return "MWS";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.SEND_START;
    }

    @Override
    public String getComment() {
        return "GuardStation settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
