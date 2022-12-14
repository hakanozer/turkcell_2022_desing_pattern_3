package _1_decorator;

public class PlatinumUser extends UserDecorator{

    @Override
    void status() {
        getUser().login();
        System.out.println("User status Platinum");
        getUser().order();
    }

}
