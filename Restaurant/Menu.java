package Restaurant;

public class Menu {
    private int id;
    private String name;
    private Dish[] dishes;

    public Menu(int id, String name, Dish[] dishes) {
        this.id = id;
        this.name = name;
        this.dishes = dishes;
    }



    public int getId() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public Dish[] getDishes() {
        return dishes;
    }
    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    


}
