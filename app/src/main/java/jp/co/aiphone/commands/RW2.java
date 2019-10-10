package jp.co.aiphone.commands;

public class RW2 implements Command {

    @Override
    public String getCommand() {
        return "RW2";
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
        return "Residence Info";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
