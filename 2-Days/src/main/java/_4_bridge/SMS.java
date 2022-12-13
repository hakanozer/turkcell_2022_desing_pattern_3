package _4_bridge;

public class SMS extends Message {

    public SMS(IMessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage(this);
    }


}
