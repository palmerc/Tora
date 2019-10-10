package jp.co.aiphone.commands;

public class MIA implements Command {

    @Override
    public String getCommand() {
        return "MIA";
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
        return "EntranceInfo";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
