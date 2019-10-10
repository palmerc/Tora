package jp.co.aiphone.commands;

public class KNA implements Command {

    @Override
    public String getCommand() {
        return "KNA";
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
        return "AccessCode(PinCode) Digit";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
