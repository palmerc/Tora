package jp.co.aiphone.commands;

public interface Command {
    public String getCommand();
    public Direction getDirection();
    public CommandType getType();
    public String getComment();

    public byte[] serialize();


}
