package _3_adapter;

public class BasketAdapter extends UserControl implements IBasket {

    @Override
    public void addBasket(int productID, String userName) {
        boolean status = control(userName);
        if (status) {
            System.out.println("Basket Add Succses: " + userName + " : " + productID);
        }else {
            System.out.println("Basket Add Fail: " + userName + " : " + productID);
        }
    }

}
