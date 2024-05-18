package Restaurant;


enum StatusEmployee {
    AVIBABLE,
    BUSY
}

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







}
