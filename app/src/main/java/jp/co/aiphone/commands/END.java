package jp.co.aiphone.commands;

public class END implements Command {

    @Override
    public String getCommand() {
        return "END";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.END_COMMUNICATON;
    }

    @Override
    public String getComment() {
        return "End the communication";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
