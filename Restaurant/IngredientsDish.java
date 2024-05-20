package Restaurant;

class IngredientsDish {
    private Dish dish;
    private Ingredient ingredient;

    public IngredientsDish(Dish dish, Ingredient ingredient) {
        this.dish = dish;
        this.ingredient = ingredient;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}