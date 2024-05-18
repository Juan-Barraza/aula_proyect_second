package Restaurant;

public class Order {
    private int id;
    private String DateTime;
    private float total;
    private Table table;
    private Employee employee;
    private Customer customer;


    public Order(int id, String DateTime, float total, Table table, Employee employee, Customer customer) {
        this.id = id;
        this.DateTime = DateTime;
        this.total = total;
        this.table = table;
        this.employee = employee;
        this.customer = customer;
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
    public Table getTable() {
        return table;
    }
    public void settable(Table table) {
        this.table = table;
    }
    public Employee getEmployeed() {
        return employee;
    }
    public void setemployeedId(Employee employee) {
        this.employee = employee;
    }
    public Customer getCustomers() {
        return customer;
    }
    public void setCustomers(Customer customer) {
        this.customer = customer;
    }
    
}
