package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecipeTest {
    Recipe recipe = new Recipe();
    public void setup1(){
    }
    public void setup2(){
        recipe.addIngredient(new Ingredient("Cebolla",315));
        recipe.addIngredient(new Ingredient("Ajo",58));
        recipe.addIngredient(new Ingredient("Arroz",520));
    }
    @Test
        public void addIngredient(){
        //Arrange
        setup1();
        //Act
        recipe.addIngredient(new Ingredient("Sal",12));
        //Assert
    }



}
