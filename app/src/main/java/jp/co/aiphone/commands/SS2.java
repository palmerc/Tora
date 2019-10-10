package jp.co.aiphone.commands;

public class SS2 implements Command {

    @Override
    public String getCommand() {
        return "SS2";
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
        return "Consecutive reading of ResidenceInfo (No LinkID)";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
