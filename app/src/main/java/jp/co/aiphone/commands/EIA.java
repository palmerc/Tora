package jp.co.aiphone.commands;

public class EIA implements Command {

    @Override
    public String getCommand() {
        return "EIA";
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
