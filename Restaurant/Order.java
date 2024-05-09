package Restaurant;

public class Order {
    private int id;
    private String DateTime;
    private float total;
    private int tableId, employeeId;
    private Customer[] customers;
    private Dish[] dishes;

    public Order(int id, String DateTime, float total, int tableId, int employeeId, Customer[] customers, Dish[] dishes) {
        this.id = id;
        this.DateTime = DateTime;
        this.total = total;
        this.tableId = tableId;
        this.employeeId = employeeId;
        this.customers = customers;
        this.dishes = dishes;
    }




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDateTime() {
        return DateTime;
    }
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }
    public float gettotal() {
        return total;
    }
    public void settotal(float total) {
        this.total = total;
    }
    public int gettableId() {
        return tableId;
    }
    public void settableId(int tableId) {
        this.tableId = tableId;
    }
    public int getemployeeId() {
        return employeeId;
    }
    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public Customer[] getCustomers() {
        return customers;
    }
    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
    public Dish[] getDishes() {
        return dishes;
    }
    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }


    
}
