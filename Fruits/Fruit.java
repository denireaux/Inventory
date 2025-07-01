package Fruits;

/**
* This is an abstract class for fruit to be inherited by specific fruits
* @author Susan S. Bai, D'Angelo L. DeNiro
*/
public abstract class Fruit {

    protected String name;
    protected String color;
    protected int weightInPounds;
    protected int costPerPound;
    protected boolean isSour;

    private final boolean hasSeeds = true;

    // Constructor
    protected Fruit(String name, String color, int weightInPounds, int costPerPound, boolean isSour) {
        this.name = name;
        this.color = color;
        this.weightInPounds = weightInPounds;
        this.costPerPound = costPerPound;
        this.isSour = isSour;
    }

    public boolean hasSeeds() {
        return hasSeeds;
    }

    public int sellingPrice() {
        return this.weightInPounds * this.costPerPound;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %d lbs @ $%d/lb, Sour: %b",
                name, color, weightInPounds, costPerPound, isSour);
    }
    
}
