package _1_oop.useAbstract;

public class MainAbstract {
    public static void main(String[] args) {

        Person person = new Person(100);
        System.out.println( person.customerTotal() );

        Customer customer = new Customer() {
            @Override
            public int customerNumber() {
                return 0;
            }
        };

    }
}
