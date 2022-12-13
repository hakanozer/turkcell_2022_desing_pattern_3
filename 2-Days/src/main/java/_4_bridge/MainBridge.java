package _4_bridge;

public class MainBridge {
    public static void main(String[] args) {

        MessageSender messageSender = new MessageSender("Message Body");
        Message sms = new SMS(messageSender);
        Message email = new Email(messageSender);
        Message notification = new Notification(messageSender);

        call(sms);
        call(email);
        call(notification);

    }

    public static void call( Message message ) {
        message.send();
    }

}
