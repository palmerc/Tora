package jp.co.aiphone.commands;

public class RER implements Command {

    @Override
    public String getCommand() {
        return "RER";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.REQUEST;
    }

    @Override
    public String getComment() {
        return "Lift2 (Elevator-Residence)";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
