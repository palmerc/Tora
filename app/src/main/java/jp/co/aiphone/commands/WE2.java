package jp.co.aiphone.commands;

public class WE2 implements Command {

    @Override
    public String getCommand() {
        return "WE2";
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
        return "ResidenceInfo settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
