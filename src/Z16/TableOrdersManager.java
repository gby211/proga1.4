package Z16;

public class TableOrdersManager implements OrdersManager {
    private Order[] orders;

    public void add(Order order, int tableNumber) {
    }

    public void addItem(MenuItem item, int tableNumber) {
    }

    public int freeTableNumber() {
        return 1;
    }
    public int[] freeTableNumber() {
        return ;
    }
    public  Order getOrder(int tableNumber){}
    public void remove(int tableNumber){}
    public int remove(Order order){}
    public int removeAll(Order order){}



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
