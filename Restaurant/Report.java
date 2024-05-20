package Restaurant;

import java.util.List;

import Restaurant.Employee.Employee;
import Restaurant.Table.Table;

public class Report {
    public static void generateOrderReport(List<Order> orders) {
        System.out.println("Order Report:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getId() + ", Total: " + order.getTotal() + ", Status: " + order.getProcess().getStatus());
        }
    }

    public static void generateTableStatusReport(List<Table> tables) {
        System.out.println("Table Status Report:");
        for (Table table : tables) {
            System.out.println("Table Number: " + table.getNumber() + ", Status: " + table.getStatus());
        }
    }

    public static void generateEmployeeStatusReport(List<Employee> employees) {
        System.out.println("Employee Status Report:");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getId() + ", Name: " + employee.getName() + ", Status: " + employee.getStatus());
        }
    }
}
