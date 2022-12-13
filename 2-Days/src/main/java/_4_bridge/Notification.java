package _4_bridge;

public class Notification extends Message{

    public Notification(IMessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage(this);
    }

}
