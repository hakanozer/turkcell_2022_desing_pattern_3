package _7_strategy;

public class CreditCard implements IPay {

    private int cardNumber;
    private int expDate;
    private int ccv;

    public CreditCard(int cardNumber, int expDate, int ccv) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.ccv = ccv;
    }

    @Override
    public void pay(int amount, User user) {
        System.out.println("Service Send : " + cardNumber + " : "+expDate +" : "+ ccv  );
        System.out.println("Card Payment :" + amount + " : " + user);
    }

}
