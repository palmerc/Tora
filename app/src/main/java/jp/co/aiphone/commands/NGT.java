package jp.co.aiphone.commands;

public class NGT implements Command {

    @Override
    public String getCommand() {
        return "NGT";
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
        return "Station Info";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
