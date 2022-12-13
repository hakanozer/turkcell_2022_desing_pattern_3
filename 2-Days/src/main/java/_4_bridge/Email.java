package _4_bridge;

public class Email extends Message {

    public Email(IMessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage(this);
    }

}
