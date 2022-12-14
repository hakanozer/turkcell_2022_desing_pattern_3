package _1_decorator;

public class GoldUser extends UserDecorator{

    @Override
    void status() {
        getUser().login();
        System.out.println("User status Gold");
        getUser().order();
    }

}
