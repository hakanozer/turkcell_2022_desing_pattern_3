package _1_oop.inheritance;

public class PDF extends Base {
    int rowCountx = 0;
    public PDF() {
        super(10);
        rowCountx = 10;
    }

    @Override
    public void print() {
        System.out.println("PDF print Call :" + rowCount);
    }

    public void action() {
        System.out.println("Action Call");
    }

}
