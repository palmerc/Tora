package jp.co.aiphone.commands;

public class MGA implements Command {

    @Override
    public String getCommand() {
        return "MGA";
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
        return "Greeting Message";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
