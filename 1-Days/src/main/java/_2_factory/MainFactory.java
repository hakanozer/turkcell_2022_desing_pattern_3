package _2_factory;

public class MainFactory {
    public static void main(String[] args) {

        Car car1 = new Car("A4", "Black", 120);
        Fabric fabric = new Fabric();
        IFactory factory = fabric.create(ECar.bmw);

        System.out.println(factory.hashCode());
        factory.foctory(car1);

    }
}
