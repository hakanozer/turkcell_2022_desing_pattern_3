package _3_command;

public class AddUser implements ICommand {

    private final User user;
    public AddUser(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        user.add();
    }

}
