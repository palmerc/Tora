package jp.co.aiphone.commands;

public class KWE implements Command {

    @Override
    public String getCommand() {
        return "KWE";
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
        return "AccessCode settings";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
