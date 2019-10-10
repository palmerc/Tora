package jp.co.aiphone.commands;

public class MWE implements Command {

    @Override
    public String getCommand() {
        return "MWE";
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
        return "GuardStation settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
