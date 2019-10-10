package jp.co.aiphone.commands;

public class BIA implements Command {

    @Override
    public String getCommand() {
        return "BIA";
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
        return "BuildingInfo";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
