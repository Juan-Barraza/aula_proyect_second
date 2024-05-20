package Restaurant.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Restaurant.Order;



public class Employee {
    private int id;
    private String name, role;
    private StatusEmployee status;
    private Order[] orders;

    public Employee(int id, String name, String role, StatusEmployee status, Order[] orders) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.status = status;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public StatusEmployee getStatus() {
        return status;
    }

    public void setStatus(StatusEmployee status) {
        this.status = status;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public void assignOrder(Order order) {
        if (this.status == StatusEmployee.AVAILABLE) {
            this.orders = Arrays.copyOf(this.orders, this.orders.length + 1);
            this.orders[this.orders.length - 1] = order;
            this.status = StatusEmployee.BUSY;
        } else {
            System.out.println("Employee is already busy.");
        }
    }

    // Método para actualizar el estado del empleado
    public void updateStatus(StatusEmployee newStatus) {
        this.status = newStatus;
    }

    // Método para marcar al empleado como disponible después de completar una orden
    public void markAsAvailable() {
        this.status = StatusEmployee.AVAILABLE;
        System.out.println("Employee " + this.name + " is now available.");
    }

    // Método para completar una orden y marcar como disponible
    public void completeOrder(Order order) {
        List<Order> orderList = new ArrayList<>(Arrays.asList(this.orders));
        orderList.remove(order);
        this.orders = orderList.toArray(new Order[0]);
        markAsAvailable();
    }
}
