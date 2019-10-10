package jp.co.aiphone.commands;

public class STW implements Command {

    @Override
    public String getCommand() {
        return "STW";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.WRITE;
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
