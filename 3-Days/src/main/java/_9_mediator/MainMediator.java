package _9_mediator;

public class MainMediator {
    public static void main(String[] args) {

        User u1 = new User(1, "Ali");
        User u2 = new User(2, "Veli");
        User u3 = new User(3, "Zehra");
        User u4 = new User(4, "Ayşe");

        IChatRoom c1 = new ChatMediator();
        c1.addChatRoom(u1);
        c1.addChatRoom(u2);
        c1.addChatRoom(u3);
        c1.addChatRoom(u4);

        c1.senderChat(u3, "Selam!");

        User u5 = new User(5, "Kemal");
        c1.addChatRoom(u5);
        c1.senderChat(u5, "Merhaba!");

    }
}
