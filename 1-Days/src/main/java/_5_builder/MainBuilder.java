package _5_builder;

public class MainBuilder {
    public static void main(String[] args) {

        Product product = new Product("TV", 15000);
        Order orderA = new AProduct(product);
        Builder builder = new Builder(orderA);

    }
}
