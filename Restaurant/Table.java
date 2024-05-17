package Restaurant;

public class Table {
private int number;
private int capacity;
private Status.Table table;
private Order[] orders;

public Table(int number, int capacity, Status.Table table, Order[] orders) {
this.number = number;
this.capacity = capacity;
this.table = table;
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


public Status.Table getTable() {
return table;
}




public void setTable(Status.Table table) {
this.table = table;
}




public Order[] getOrders() {
return orders;
}




public void setOrders(Order[] orders) {
this.orders = orders;
}


}







