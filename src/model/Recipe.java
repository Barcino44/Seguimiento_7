package model;

import java.util.ArrayList;

public class Recipe {
    public ArrayList<Ingredient> ingredients;
    public Recipe() {
            ingredients = new ArrayList<>();
        }
        public void addIngredient(Ingredient ingredient) {
            if (!ingredients.contains(ingredient)) ingredients.add(ingredient);
            else {
                int index = ingredients.indexOf(ingredient);
                ingredients.get(index).addWeight(ingredient.getWeight());
            }
        }
        public int getWeigthOfIngredient(String name){
            int weigth=0;
            for (int i=0;i<ingredients.size();i++){
                if(ingredients.get(i).getName().equals(name)){
                    weigth=ingredients.get(i).getWeight();
                }
            }
            return weigth;
        }
        public Ingredient getLast(){
            return ingredients.get(ingredients.size()-1);
        }
        public int numberOfIngredients(){
            return ingredients.size();
        }
        public void removeIngredient(String name){
            for (int i=0; i<ingredients.size();i++){
                if(ingredients.get(i).getName().equals(name)){
                    ingredients.remove(i);
                }
            }
        }
}
