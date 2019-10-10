package jp.co.aiphone.commands;

public class BWS implements Command {

    @Override
    public String getCommand() {
        return "BWS";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.SEND_START;
    }

    @Override
    public String getComment() {
        return "BuildingInfo settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
