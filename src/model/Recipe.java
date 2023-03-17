package model;

import java.util.ArrayList;

public class Recipe {
    public ArrayList<Ingredient> ingredients;
    public Recipe() {
            ingredients = new ArrayList<>();
        }
        public void addIngredient(Ingredient ingredient) {
            ingredients.add(ingredient);
        }

}
