package jp.co.aiphone.commands;

public class MW2 implements Command {

    @Override
    public String getCommand() {
        return "MW2";
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
        return "PinCode of Manager";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
