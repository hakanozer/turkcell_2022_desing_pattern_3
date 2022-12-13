package _5_facade;

public class MainFacade {
    public static void main(String[] args) {

        Order order = new Order("zehra@mail.com", "12345", "644");
        OrderFacade facade = new OrderFacade();
        boolean status = facade.sendOrder(order);
        System.out.println("Order: " + status);

    }
}
