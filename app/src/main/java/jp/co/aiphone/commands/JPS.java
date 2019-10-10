package jp.co.aiphone.commands;

public class JPS implements Command {

    @Override
    public String getCommand() {
        return "JPS";
    }

    @Override
    public Direction getDirection() {
        return Direction.OUT;
    }

    @Override
    public CommandType getType() {
        return CommandType.SEND_START;
    }

    @Override
    public String getComment() {
        return "Send Pictuer of Stand by Screen";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
