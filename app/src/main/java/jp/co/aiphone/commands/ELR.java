package jp.co.aiphone.commands;

public class ELR implements Command {

    @Override
    public String getCommand() {
        return "ELR";
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
        return "Lift1 (ElevatorSetting)";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
