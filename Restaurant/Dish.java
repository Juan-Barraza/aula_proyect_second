package Restaurant;


public class Dish {
    private int id;
    private String name, description;
    private float price;
    private Menu menu;


    public Dish(int id, String name, String description, String status, float price, Menu menu) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.menu = menu;
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
    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    


}
