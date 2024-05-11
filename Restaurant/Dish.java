package Restaurant;

public class Dish {
    private int id;
    private String name, description, status;
    private float price;
    private Ingredient[] ingredients;
    private Order[] orders;

    public Dish(int id, String name, String description, String status, float price, Ingredient[] ingredients, Order[] orders) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.price = price;
        this.ingredients = ingredients;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Ingredient[] getIngredients() {
        return ingredients;
    }
    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
    public Order[] getOrders() {
        return orders;
    }
    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
