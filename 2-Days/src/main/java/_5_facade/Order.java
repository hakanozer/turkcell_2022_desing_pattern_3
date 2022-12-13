package _5_facade;

public class Order {

    private String email;
    private String password;
    private String productID;

    public Order(String email, String password, String productID) {
        this.email = email;
        this.password = password;
        this.productID = productID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
}
