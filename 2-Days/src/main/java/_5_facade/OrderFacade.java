package _5_facade;

public class OrderFacade implements  IOrder{

    @Override
    public boolean sendOrder(Order order) {
        boolean status = false;
        UserControl userControl = new UserControl();
        String userId = userControl.userID(order.getEmail(), order.getPassword());
        if (!userId.equals("")) {
            OrderControl orderControl = new OrderControl();
            status = orderControl.order(userId, order.getProductID());
        }
        return status;
    }

}
