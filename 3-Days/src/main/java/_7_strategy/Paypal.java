package _7_strategy;

public class Paypal implements IPay {

    private String apiKey;
    public Paypal(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void pay(int amount, User user) {
        System.out.println("Service Send : " + apiKey  );
        System.out.println("Paypal Payment :" + amount + " : " + user);
    }

}
