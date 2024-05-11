package Restaurant;

public class Customer {
    
    private int id;
    private String name, phone, email;
    private Order order;

    public Customer(int id, String name, String phone, String email, Order order) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.order = order;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
}
