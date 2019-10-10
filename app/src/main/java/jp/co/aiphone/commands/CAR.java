package jp.co.aiphone.commands;

public class CAR implements Command {

    @Override
    public String getCommand() {
        return "CAR";
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
        return "PinCode of Contractor";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
