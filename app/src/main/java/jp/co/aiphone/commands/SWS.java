package jp.co.aiphone.commands;

public class SWS implements Command {

    @Override
    public String getCommand() {
        return "SWS";
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
        return "Station settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
