package _9_mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatRoom{

    private List<User> users = new ArrayList<>();

    @Override
    public void addChatRoom(User user) {
        if ( !users.contains(user) ) {
            users.add(user);
        }
    }

    @Override
    public void senderChat(User user, String message) {
        for ( User userSend : users ) {
            if ( userSend != user ) {
                System.out.println(user.getName() + " : " + userSend.getName() + " : " + message);
            }
        }
    }

}
