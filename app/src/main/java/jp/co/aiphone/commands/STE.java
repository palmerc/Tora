package jp.co.aiphone.commands;

public class STE implements Command {

    @Override
    public String getCommand() {
        return "STE";
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
        return "End Consecutive reading of StationSetting";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
