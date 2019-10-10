package jp.co.aiphone.commands;

public class CAW implements Command {

    @Override
    public String getCommand() {
        return "CAW";
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
        return "PinCode of Contractor";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
