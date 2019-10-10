package jp.co.aiphone.commands;

public class LS2 implements Command {

    @Override
    public String getCommand() {
        return "LS2";
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
        return "Consecutive reading of ResidenceInfo (With LinkID)";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
