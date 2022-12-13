package _6_composite;

import java.util.ArrayList;
import java.util.List;

public class ComputerComponent implements Item{

    private List<Item> items = new ArrayList<>();

    @Override
    public String title() {
        return "Computer";
    }

    @Override
    public int price() {
        int sm = 0;
        for( Item item : getItems() ) {
            sm += item.price();
        }
        return sm;
    }

    public void add(Item item) {
        getItems().add(item);
    }

    public void remoce(Item item) {
        getItems().remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
