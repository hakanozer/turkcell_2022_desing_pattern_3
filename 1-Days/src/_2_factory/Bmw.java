package _2_factory;

public class Bmw implements IFactory{

    @Override
    public void foctory(Car car) {
        System.out.println("Bmw :" + car);
    }

}