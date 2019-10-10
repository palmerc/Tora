package jp.co.aiphone.commands;

public class KNW implements Command {

    @Override
    public String getCommand() {
        return "KNW";
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
        return "AccessCode (PinCode) Digit";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
