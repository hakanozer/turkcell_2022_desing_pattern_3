package _1_decorator;

public class User implements IUser{

    @Override
    public void login() {
        System.out.println("Login Action");
    }

    @Override
    public void order() {
        System.out.println("Order Action");
    }

}
