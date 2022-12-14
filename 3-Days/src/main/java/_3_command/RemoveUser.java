package _3_command;

public class RemoveUser implements ICommand{

    private final User user;
    public RemoveUser(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        user.remove();
    }

}
