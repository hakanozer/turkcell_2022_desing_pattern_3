package _6_composite;

public class Keyboard implements Item {

    @Override
    public String title() {
        return "Keyboard";
    }

    @Override
    public int price() {
        return 500;
    }

}
