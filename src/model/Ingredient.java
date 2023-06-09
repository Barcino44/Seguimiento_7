package model;
import Exception.*;
public class Ingredient {
    private String name;
    private int weight;

    public Ingredient(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void addWeight(int weight) throws AddingNegativeWeightException{
        if(weight<0) throw new AddingNegativeWeightException();
        this.weight += weight;
    }
    public void removeWeight(int weight) throws DeletingNegativeWeightException {
            if(weight<0) throw new DeletingNegativeWeightException();
            this.weight-=weight;
        }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Ingredient){
            Ingredient other = (Ingredient) obj;
            return this.name.equals(other.name);
        }else{
            return false;
        }
    }
}
