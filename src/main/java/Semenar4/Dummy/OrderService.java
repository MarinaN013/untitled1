package Semenar4.Dummy;

public class OrderService {
    private OrderDatabase database;

    public OrderService(OrderDatabase database) {
        this.database = database;
    }

    public void addOrder(Order order) {
        database.store(order);
    }
}
