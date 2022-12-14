package _5_state;

public class Currency {

    private String currencyName;
    private String forexBuying;
    private String forexSelling;

    public Currency(String currencyName, String forexBuying, String forexSelling) {
        this.currencyName = currencyName;
        this.forexBuying = forexBuying;
        this.forexSelling = forexSelling;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getForexBuying() {
        return forexBuying;
    }

    public String getForexSelling() {
        return forexSelling;
    }
}
