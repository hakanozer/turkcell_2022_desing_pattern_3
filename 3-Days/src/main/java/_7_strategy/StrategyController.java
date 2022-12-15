package _7_strategy;

public class StrategyController {

    private IPay iPay;
    public StrategyController(IPay iPay) {
        this.iPay = iPay;
    }

    public void payAction( int amount, User user  ) {
        this.iPay.pay(amount, user);
    }

}
