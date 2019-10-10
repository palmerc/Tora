package jp.co.aiphone.commands;

public class REW implements Command {

    @Override
    public String getCommand() {
        return "REW";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.WRITE;
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
