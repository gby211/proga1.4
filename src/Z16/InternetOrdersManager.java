package Z16;

public class InternetOrdersManager implements OrdersManager{

    private QueueNode head;
    private QueueNode trail;
    private int size;
    public boolean add(Order order){}
    public Order remove(){}
    public Order order(){}


    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
