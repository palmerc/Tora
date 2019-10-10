package jp.co.aiphone.commands;

public class CAA implements Command {

    @Override
    public String getCommand() {
        return "CAA";
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
        return "PinCode of Contractor";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
