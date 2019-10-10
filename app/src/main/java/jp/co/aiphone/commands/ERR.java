package jp.co.aiphone.commands;

public class ERR implements Command {

    @Override
    public String getCommand() {
        return "ERR";
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
        return "Registration data abnormality";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
