package jp.co.aiphone.commands;

public class EWE implements Command {

    @Override
    public String getCommand() {
        return "EWE";
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
        return "EntranceInfo settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
