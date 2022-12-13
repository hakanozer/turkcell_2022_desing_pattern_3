package _1_prototype;

public class CustomerAddress extends AddressPrototype {

    public CustomerAddress(
            String title,
            String phone,
            String street,
            String no,
            String city
            )
    {
        setTitle(title);
        setCity(city);
        setNo(no);
        setPhone(phone);
        setStreet(street);
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", street='" + street + '\'' +
                ", no='" + no + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
