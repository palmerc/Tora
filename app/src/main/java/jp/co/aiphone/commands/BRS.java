package jp.co.aiphone.commands;

public class BRS implements Command {

    @Override
    public String getCommand() {
        return "BRS";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.REQUEST;
    }

    @Override
    public String getComment() {
        return "Consecutive reading of BuildingInfo";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
