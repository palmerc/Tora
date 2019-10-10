package jp.co.aiphone.commands;

public class JPT implements Command {

    @Override
    public String getCommand() {
        return "JPT";
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
        return "Picture transmission success";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
