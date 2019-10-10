package jp.co.aiphone.commands;

public class KWS implements Command {

    @Override
    public String getCommand() {
        return "KWS";
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
        return "AccessCode settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
