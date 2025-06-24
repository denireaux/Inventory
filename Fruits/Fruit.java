package Fruits;

/**
* This is an abstract class for fruit to be inherit by specific fruits
* @author Susan S. Bai, D'Angelo L. DeNiro
*/
public abstract class Fruit {

    protected String name;
    private final boolean hasSeeds = true;

    String color;
    int weightInPounds;
    int costPerPound;
    boolean isSour;


    // Constructor
    protected Fruit(
        String name, 
        String color, 
        int weightInPounds, 
        int costPerPound
        ) {
        this.name = name;
        this.color = color;
        this.weightInPounds = weightInPounds;
        this.costPerPound = costPerPound;
        this.isSour = isSour;
    }

    public int sellingPrice() {
        int sellingPrice = this.weightInPounds * this.costPerPound;
        return sellingPrice;
    }
}