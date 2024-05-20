import java.util.Arrays;
import java.util.List;

import Restaurant.*;
import Restaurant.Employee.*;
import Restaurant.Process.StatusProcess;
import Restaurant.Table.StatusTable;
import Restaurant.Table.Table;

public class Main {
    public static void main(String[] args) {
        // Crear algunos ingredientes
        Ingredient tomato = new Ingredient(1, "Tomato", "Fresh tomato");
        Ingredient cheese = new Ingredient(2, "Cheese", "Mozzarella cheese");
        Ingredient dough = new Ingredient(3, "Dough", "Pizza dough");

        // Crear algunos platos
        Dish pizza = new Dish(1, "Pizza", "Delicious cheese pizza", 12.99f, null);
        pizza.addIngredient(tomato);
        pizza.addIngredient(cheese);
        pizza.addIngredient(dough);

        Dish pasta = new Dish(2, "Pasta", "Creamy Alfredo pasta", 10.99f, null);

        // Crear un menú y añadir platos
        Menu menu = new Menu(1, "Main Menu");
        menu.addDish(pizza);
        menu.addDish(pasta);

        // Listar los platos del menú
        menu.listDishes();

        // Crear algunas mesas
        Table table1 = new Table(1, 4, StatusTable.FREE);
        Table table2 = new Table(2, 2, StatusTable.FREE);

        // Crear algunos empleados
        Employee employee1 = new Employee(1, "John Doe", "Waiter", StatusEmployee.AVAILABLE, new Order[0]);
        Employee employee2 = new Employee(2, "Jane Smith", "Chef", StatusEmployee.AVAILABLE, new Order[0]);

        // Crear un cliente
        Customer customer1 = new Customer(1, "Alice", "123-456-7890", "alice@example.com");

        // Cliente hace un pedido
        DishOrder dishOrder1 = new DishOrder(pizza, null);
        DishOrder dishOrder2 = new DishOrder(pasta, null);
        List<DishOrder> dishOrders = Arrays.asList(dishOrder1, dishOrder2);

        // Asignar una mesa y un empleado al pedido
        Order order1 = customer1.makeOrder(table1, dishOrders, employee1);

        // Mostrar detalles del pedido
        System.out.println("Order Details:");
        System.out.println("Order ID: " + order1.getId());
        System.out.println("Customer: " + customer1.getName());
        System.out.println("Table: " + table1.getNumber());
        System.out.println("Employee: " + employee1.getName());
        System.out.println("Total: $" + order1.getTotal());

        // Actualizar estado del proceso
        order1.updateProcessStatus(StatusProcess.RECEIVED_IN_KITCHEN);
        System.out.println("Order status updated to: " + order1.getProcess().getStatus());

        // El empleado completa el pedido y se marca como disponible
        employee1.completeOrder(order1);

        // Generar reportes
        Report.generateOrderReport(customer1.getOrders());
        Report.generateTableStatusReport(Arrays.asList(table1, table2));
        Report.generateEmployeeStatusReport(Arrays.asList(employee1, employee2));
    }
}
