package Restaurant;

public class Employee {
    private int id;
    private String name, role;
    private Status.Employee employee; 
    private Order[] orders;

public Employee(int id, String name, String role, Status.Employee employee, Order[] orders) {
this.id = id;
this.name = name;
this.role = role;
this.employee = employee; 
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



    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Status.Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Status.Employee employee) {
        this.employee = employee;
    }
}