package _1_decorator;

public abstract class UserDecorator {

    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    abstract void status();

}
