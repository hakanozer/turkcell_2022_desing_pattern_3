package _4_bridge;

public abstract class Message {

    public abstract void send();

    public IMessageSender messageSender;
    public Message( IMessageSender messageSender ) {
        this.messageSender = messageSender;
    }

}
