package _1_decorator;

public class StandardUser extends UserDecorator{

    @Override
    void status() {
        getUser().login();
        System.out.println("User status Standard");
        getUser().order();
    }


}
