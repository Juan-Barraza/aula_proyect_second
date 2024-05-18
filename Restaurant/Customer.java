package Restaurant;

public class Customer {

private int id;
private String name, phone, email;
private Order[] orders;

public Customer(int id, String name, String phone, String email, Order[] orders) {
this.id = id;
this.name = name;
this.phone = phone;
this.email = email;
this.orders = orders;
}





public void makeOrder(){
    
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
public Order[] getOrders() {
return orders;
}
public void setOrder(Order[] orders) {
this.orders = orders;
}
}
