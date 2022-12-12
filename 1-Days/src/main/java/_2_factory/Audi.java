package _2_factory;

public class Audi implements IFactory{

    @Override
    public void foctory(Car car) {
        System.out.println("Audi :" + car);
    }

}
