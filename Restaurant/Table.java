package Restaurant;

enum StatusTable{
    FREE, BUSY
}

public class Table {
    private int number;
    private int capacity;
    private StatusTable status;
    private Order[] orders;
    
    public Table(int number, int capacity, StatusTable status, Order[] orders) {
        this.number = number;
        this.capacity = capacity;
        this.status = status;
        this.orders = orders;
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

public Order[] getOrder() {
return orders;
}
public void setOrder(Order[] orders) {
this.orders = orders;
}

public Order[] getOrders() {
return orders;
}

public void setOrders(Order[] orders) {
this.orders = orders;
}

public StatusTable getStatus() {
    return status;
}

public void setStatus(StatusTable status) {
    this.status = status;
}


}







