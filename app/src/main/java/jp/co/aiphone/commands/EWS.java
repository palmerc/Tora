package jp.co.aiphone.commands;

public class EWS implements Command {

    @Override
    public String getCommand() {
        return "EWS";
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
        return "EntranceInfo settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
