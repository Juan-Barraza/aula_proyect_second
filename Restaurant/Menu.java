package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int id;
    private String name;
    private List<Dish> dishes;

    public Menu(int id, String name) {
        this.id = id;
        this.name = name;
        this.dishes = new ArrayList<>();
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

    public List<Dish> getDishes() {
        return dishes;
    }

    // Método para agregar un plato al menú
    public void addDish(Dish dish) {
        this.dishes.add(dish);
    }

    // Método para eliminar un plato del menú
    public void removeDish(Dish dish) {
        this.dishes.remove(dish);
    }

    // Método para listar los platos del menú
    public void listDishes() {
        System.out.println("Menu: " + this.name);
        for (Dish dish : dishes) {
            System.out.println("Dish ID: " + dish.getId() + ", Name: " + dish.getName() + ", Price: $" + dish.getPrice());
        }
    }
}
