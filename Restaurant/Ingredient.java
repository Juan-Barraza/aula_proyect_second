package Restaurant;

public class Ingredient {
    private int id;
    private String name, description;
    private Dish[] dishes;


    public Ingredient(int id, String name, String description, Dish[] dishes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dishes = dishes;
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
    public Dish[] getDishes() {
        return dishes;
    }
    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

}
