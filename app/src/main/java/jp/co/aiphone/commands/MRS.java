package jp.co.aiphone.commands;

public class MRS implements Command {

    @Override
    public String getCommand() {
        return "MRS";
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
        return "Consecutive reading of GuardStationInfo";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
