package _2_factory;

public class Car {

    private String brand;
    private String modal;
    private int power;

    public Car(String brand, String modal, int power) {
        this.brand = brand;
        this.modal = modal;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modal='" + modal + '\'' +
                ", power=" + power +
                '}';
    }
}
