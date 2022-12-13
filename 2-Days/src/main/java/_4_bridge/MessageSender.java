package _4_bridge;

public class MessageSender implements IMessageSender {

    private String txtMessage;
    public MessageSender(String txtMessage) {
        this.txtMessage = txtMessage;
    }

    @Override
    public void sendMessage(Message message) {
        if ( message instanceof  SMS ) {
            System.out.println("SMS");
        }
        if ( message instanceof  Email ) {
            System.out.println("Email");
        }
        if ( message instanceof  Notification ) {
            System.out.println("Notification");
        }
        System.out.println(getTxtMessage());
    }

    public String getTxtMessage() {
        return txtMessage;
    }

    public void setTxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
    }
}
