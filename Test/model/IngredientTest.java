package model;

import org.junit.Test;
import Exception.*;
import static org.junit.Assert.*;

public class IngredientTest {
    Ingredient ingredient;
    public void setup1(){
       ingredient =new Ingredient("Tomate",245);
    }
    @Test
    public void addWeight(){
        //Arrange
        setup1();
        //Act
        ingredient.addWeight(54);
        //Assert
        assertEquals(ingredient.getWeight(),299);
    }
    @Test
    public void validateAddingNegativeWeigth() {
        boolean result=false;
        //Arrange
        setup1();
        //Act
        try {
            ingredient.addWeight(-100);
            result=true;
        } catch (AddingNegativeWeightException ex) {
            ex.printStackTrace();
        }
        assertTrue(result);
    }
    @Test
    public void removeWeight(){
        //Arrange
        setup1();
        //Act
        ingredient.removeWeight(45);
        //Assert
        assertEquals(ingredient.getWeight(),200);


    }
    @Test
    public void validateRemovingNegativeWeigth(){
        //Arrange
        setup1();
        //Act

    }

}
