package jp.co.aiphone.commands;

public class KNR implements Command {

    @Override
    public String getCommand() {
        return "KNR";
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
        return "AccessCode(PinCode) Digit";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
