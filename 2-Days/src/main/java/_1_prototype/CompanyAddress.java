package _1_prototype;

public class CompanyAddress extends AddressPrototype{

    private int invoiceNo;
    public CompanyAddress( AddressPrototype obj, int invoiceNo
    )
    {
        setTitle(obj.getTitle());
        setCity(obj.getCity());
        setNo(obj.getNo());
        setPhone(obj.getPhone());
        setStreet(obj.getStreet());
        setInvoiceNo(invoiceNo);
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Override
    public String toString() {
        return "CompanyAddress{" +
                "title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", street='" + street + '\'' +
                ", no='" + no + '\'' +
                ", city='" + city + '\'' +
                ", invoiceNo=" + invoiceNo +
                '}';
    }

}
