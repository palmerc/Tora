package jp.co.aiphone.commands;

public class ERS implements Command {

    @Override
    public String getCommand() {
        return "ERS";
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
        return "Consecutive reading of EntranceInfo";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
