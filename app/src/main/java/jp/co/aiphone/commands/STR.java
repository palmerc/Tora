package jp.co.aiphone.commands;

public class STR implements Command {

    @Override
    public String getCommand() {
        return "STR";
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
        return "Consecutive reading of StationSetting";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
