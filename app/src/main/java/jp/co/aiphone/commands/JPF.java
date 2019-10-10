package jp.co.aiphone.commands;

public class JPF implements Command {

    @Override
    public String getCommand() {
        return "JPF";
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
        return "Picture transmission failure";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
