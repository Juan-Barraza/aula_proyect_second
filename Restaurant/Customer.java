package Restaurant;

import java.util.ArrayList;
import java.util.List;

import Restaurant.Employee.Employee;
import Restaurant.Table.Table;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private String email;
    private List<Order> orders = new ArrayList<Order>();

    public Customer(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Order makeOrder(Table table, List<DishOrder> dishOrders, Employee employee) {
        Order order = new Order(0, table, employee, this);
        order.setDishOrders(dishOrders);
        order.calculateTotal();
        this.orders.add(order);

        table.assignOrder(order);
        employee.assignOrder(order);
        return order;
    }
}
