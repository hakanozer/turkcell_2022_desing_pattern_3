package _1_decorator;

public class MainDecorator {
    public static void main(String[] args) {

        UserDecorator gold = new GoldUser();
        UserDecorator platinium = new PlatinumUser();
        UserDecorator standard = new StandardUser();

        call(gold);
        call(platinium);
        call(standard);

    }

    public static void call( UserDecorator decorator ) {
        decorator.status();
    }

}
