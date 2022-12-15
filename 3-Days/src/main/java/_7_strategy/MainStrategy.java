package _7_strategy;

public class MainStrategy {
    public static void main(String[] args) {

        User user = new User("serkan@mail.com", "Serkan");
        int total = 3000;

        IPay card = new CreditCard(2137234234,062022,123 );
        IPay paypal = new Paypal("12lk312kj31jk23h12");
        StrategyController controller = new StrategyController(card);
        controller.payAction(total, user);
    }
}
