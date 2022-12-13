package _6_composite;

public class Ram implements Item{
    @Override
    public String title() {
        return "Ram";
    }

    @Override
    public int price() {
        return 1200;
    }
}
