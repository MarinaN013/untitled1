package Semenar4.Mock;

public class OrderProcessor {
    private DeliveryService deliveryService;

    public OrderProcessor(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void processOrder(Order order) {
        // Логика обработки заказа...
        deliveryService.scheduleDelivery(order);
    }
}
