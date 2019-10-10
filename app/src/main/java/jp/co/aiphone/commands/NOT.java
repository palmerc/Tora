package jp.co.aiphone.commands;

public class NOT implements Command {

    @Override
    public String getCommand() {
        return "NOT";
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
        return "No Data Available (End of Data)";
    }

    @Override
    public byte[] serialize() {
        return new byte[0];
    }
}
