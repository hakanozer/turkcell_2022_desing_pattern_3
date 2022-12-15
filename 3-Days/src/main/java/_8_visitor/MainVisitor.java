package _8_visitor;

public class MainVisitor {
    public static void main(String[] args) {

        String json = "{\"name\":\"erkan\", \"email\":\"erkan@mail.com\"}";
        StringJson stringJson = new StringJson();

        JsonString jsonString = new JsonString();
        Customer customer = new Customer();
        customer.setName("Zehra Bil");
        customer.setEmail("zehra@mail.com");

        ActionVisitor visitor = new ActionVisitor();
        visitor.visit(jsonString, customer);





    }
}
