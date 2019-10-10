package jp.co.aiphone.commands;

public class JPR implements Command {

    @Override
    public String getCommand() {
        return "JPR";
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
        return "Part of the picture Reception end";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
