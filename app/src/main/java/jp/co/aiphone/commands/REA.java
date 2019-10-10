package jp.co.aiphone.commands;

public class REA implements Command {

    @Override
    public String getCommand() {
        return "REA";
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
        return "Lift2 (Elevator-Residence)";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
