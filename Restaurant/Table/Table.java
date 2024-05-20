package Restaurant.Table;

import java.util.ArrayList;
import java.util.List;

import Restaurant.Order;



public class Table {
    private int number;
    private int capacity;
    private StatusTable status;
    private List<Order> orders = new ArrayList<Order>();

    public Table(int number, int capacity, StatusTable status) {
        this.number = number;
        this.capacity = capacity;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public StatusTable getStatus() {
        return status;
    }

    public void setStatus(StatusTable status) {
        this.status = status;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void assignOrder(Order order) {
        if (this.status == StatusTable.FREE) {
            this.orders.add(order);
            this.status = StatusTable.BUSY;
        } else {
            System.out.println("Table is already occupied.");
        }
    }

    // Método para liberar la mesa
    public void freeTable() {
        this.status = StatusTable.FREE;
        this.orders = new ArrayList<Order>(); // Reset orders
    }
}
