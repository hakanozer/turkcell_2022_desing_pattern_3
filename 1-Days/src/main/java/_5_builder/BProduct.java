package _5_builder;

public class BProduct extends Order {

    Product pro;
    public BProduct(Product pro ) {
        this.pro = pro;
    }

    @Override
    void clearBasket() {
        System.out.println("clearBasket :" + pro);
    }

    @Override
    void order() {
        System.out.println("order :" + pro);
    }
}
