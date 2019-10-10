package jp.co.aiphone.commands;

public class INI implements Command {

    @Override
    public String getCommand() {
        return "INI";
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
        return "Initialize";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
