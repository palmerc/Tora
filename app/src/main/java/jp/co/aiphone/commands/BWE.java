package jp.co.aiphone.commands;

public class BWE implements Command {

    @Override
    public String getCommand() {
        return "BWE";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.SEND_END;
    }

    @Override
    public String getComment() {
        return "Station settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
