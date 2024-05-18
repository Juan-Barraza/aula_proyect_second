package Restaurant;

import java.time.format.DateTimeFormatter;
import java.util.Date;


enum StatusProcess{
    RECEIVED_IN_KITCHEN,
    ON_GOING,
    PREPARING,
    SERVED_ON_DISH,
    DELIVERED
}

public class Process {
    private int id;
    private DishOrder dishOrder;
    private Employee employee;
    private StatusProcess status;
    private DateTimeFormatter dateTimeFormatter;
    Date fecha;

    public Process(int id, DishOrder dishOrder, Employee employee, StatusProcess status) {
        this.id = id;
        this.dishOrder = dishOrder;
        this.employee = employee;
        this.status = status;
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
    }















    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public DishOrder getDishOrder() {
        return dishOrder;
    }
    public void setDishes(DishOrder dishOrder) {
        this.dishOrder = dishOrder;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public StatusProcess getStatus() {
        return status;
    }
    public void setStatus(StatusProcess status) {
        this.status = status;
    }
    public DateTimeFormatter getDateTimeFormatter() {
        return dateTimeFormatter;
    }
    public void setDateTimeFormatter(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
