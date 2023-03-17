package model;

import org.junit.Assert;
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
        public void addIngredientSetup1(){
        //Arrange
        setup1();
        //Act
        recipe.addIngredient(new Ingredient("Sal",12));
        //Assert
        assertEquals(recipe.numberOfIngredients(),1);
        assertEquals(recipe.getLast().getName(), "Sal");
        assertEquals(recipe.getLast().getWeight(), 12);
    }
    @Test
    public void addIngredientSetup2(){
        //Arrange
        setup2();
        //Act
        recipe.addIngredient(new Ingredient("Pimienta",6));
        //Assert
        assertEquals(recipe.numberOfIngredients(),4);
        assertEquals(recipe.getLast().getName(),"Pimienta");
        assertEquals(recipe.getLast().getWeight(),6 );
    }
    @Test
    public void addIngredientThatAlreadyExistSetup2(){
        //Arrange
        setup2();
        //Act
        recipe.addIngredient(new Ingredient("Ajo",21));
        //Assert
        assertEquals(recipe.numberOfIngredients(),3);
        assertEquals(recipe.getWeigthOfIngredient("Ajo"),79);
    }
    @Test
    public void removeElementSetup2(){
        //Arrange
        setup2();
        //Act
        recipe.removeIngredient("Ajo");
        //Assert
        assertEquals(recipe.numberOfIngredients(),2);
    }
}
