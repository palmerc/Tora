package jp.co.aiphone.commands;

public class ELW implements Command {

    @Override
    public String getCommand() {
        return "ELW";
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
        return "Lift1 (ElevatorSetting)";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
