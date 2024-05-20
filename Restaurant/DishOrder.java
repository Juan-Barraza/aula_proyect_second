package Restaurant;

public class DishOrder {
    private Dish dish;
    private Order order;

    public DishOrder(Dish dish, Order order) {
        this.dish = dish;
        this.order = order;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
