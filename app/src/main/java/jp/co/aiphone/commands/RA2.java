package jp.co.aiphone.commands;

public class RA2 implements Command {

    @Override
    public String getCommand() {
        return "RA2";
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
        return "ResidenceInfo";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
