package _1_oop.useAbstract;

public abstract class Customer {

    public abstract int customerNumber();

    public int customerTotal() {
        int total = 0;
        if ( customerNumber() == 100 ) {
            total = 100000;
        }
        if ( customerNumber() == 200 ) {
            total = 200000;
        }
        return total;
    }

}
