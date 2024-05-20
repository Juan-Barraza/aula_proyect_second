package Restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Restaurant.Employee.*;
import Restaurant.Process.Process;
import Restaurant.Process.StatusProcess;
import Restaurant.Table.Table;

public class Order {
    private int id;
    private LocalDateTime dateTime;
    private float total;
    private Table table;
    private Employee employee;
    private Customer customer;
    private Process process;
    private List<DishOrder> dishOrders = new ArrayList<>();
    private static int ID_CONTADOR = 0;

    public Order(float total, Table table, Employee employee, Customer customer) {
        Order.ID_CONTADOR += 1;
        this.id = Order.ID_CONTADOR;
        this.dateTime = LocalDateTime.now();
        this.total = total;
        this.table = table;
        this.employee = employee;
        this.customer = customer;
        this.process = new Process();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Table getTable() {
        return this.table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Process getProcess() {
        return this.process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public List<DishOrder> getDishOrders() {
        return this.dishOrders;
    }

    public void setDishOrders(List<DishOrder> dishOrders) {
        this.dishOrders = dishOrders;
    }

    public void calculateTotal() {
        this.total = 0;
        for (DishOrder dishOrder : this.dishOrders) {
            this.total += dishOrder.getDish().getPrice();
        }
    }

    // Método para cambiar el estado del proceso
    public void updateProcessStatus(StatusProcess newStatus) {
        this.process.updateStatus(newStatus);
        notifyStatusChange();
    }

    // Método para notificar cambio de estado
    private void notifyStatusChange() {
        System.out.println("Order " + this.id + " status changed to " + this.process.getStatus());
    }
}
