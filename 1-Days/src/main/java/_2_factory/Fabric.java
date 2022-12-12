package _2_factory;

public class Fabric {

    public IFactory create( ECar eCar ) {
        switch (eCar) {
            case audi:
                return new Audi();
            case bmw:
                return new Bmw();
            default:
                return null;
        }
    }

}
