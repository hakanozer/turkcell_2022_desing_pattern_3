package _6_composite;

public class MainComposite {
    public static void main(String[] args) {

        Item mouse = new Mouse();
        Item keyboard = new Keyboard();
        Item ram1 = new Ram();
        Item ram2 = new Ram();

        ComputerComponent com = new ComputerComponent();
        com.add(mouse);
        com.add(keyboard);
        com.add(ram1);
        com.add(ram2);

        // remove
        com.remoce(ram2);
        int sum = com.price();
        System.out.println("Items Total Price:  " + sum);


    }
}
