package _1_prototype;

public class MainPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        CustomerAddress customerAddress = new CustomerAddress("Ev Adresi", "5445556677","İstiklal", "30", "İstanbul");
        System.out.println(customerAddress);

        CustomerAddress obj = (CustomerAddress) customerAddress.clone();
        obj.setTitle("İş Yeri Adresi");
        CompanyAddress companyAddress = new CompanyAddress(obj, 1231231);
        System.out.println(companyAddress);
    }

}
