package _1_oop.useAbstract;

public class Person extends Customer{

    int customerNumber = 0;
    public Person(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public int customerNumber() {
        return customerNumber;
    }

}
