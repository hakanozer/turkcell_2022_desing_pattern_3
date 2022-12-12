package _5_builder;

public class AProduct extends Order {

    Product pro;
    public AProduct( Product pro ) {
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
