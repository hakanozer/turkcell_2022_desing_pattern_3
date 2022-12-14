package _3_command;

public class MainCommand {
    public static void main(String[] args) {

        User user = new User("Ali Bimem", "ali@mail.com");
        ICommand c1 = new AddUser(user);
        ICommand c2 = new AddUser(user);
        ICommand c3 = new RemoveUser(user);

        UserController controller = new UserController();
        controller.action(c1, c2, c3);

        controller.report();

    }
}
