package Restaurant;

public class Table {
    private int number;
    private int capacity;
    private String status;
    private Order order;

    public Table(int number, int capacity, String status, Order order) {
        this.number = number;
        this.capacity = capacity;
        this.status = status;
        this.order = order;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    




}
