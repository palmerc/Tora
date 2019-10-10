package jp.co.aiphone.commands;

public class STA implements Command {

    @Override
    public String getCommand() {
        return "STA";
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
        return "StationSetting";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
