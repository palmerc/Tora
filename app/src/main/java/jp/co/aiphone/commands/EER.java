package jp.co.aiphone.commands;

public class EER implements Command {

    @Override
    public String getCommand() {
        return "EER";
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
        return "Write anomaly";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
