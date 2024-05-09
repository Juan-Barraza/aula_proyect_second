package Restaurant;

public class Menu {
    private int id;
    private String namee;
    private Dish[] dishes;

    public Menu(int id, String namee, Dish[] dishes) {
        this.id = id;
        this.namee = namee;
        this.dishes = dishes;
    }





    
    public int getId() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public String getNamee() {
        return namee;
    }
    public void setNamee(String namee) {
        this.namee = namee;
    }
    public Dish[] getDishes() {
        return dishes;
    }
    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    


}
