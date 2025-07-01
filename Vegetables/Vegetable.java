package Vegetables;

/**
* This is an abstract class for vegetables to be inherited by specific vegetables
* @author Susan S. Bai, D'Angelo L. DeNiro
*/
public abstract class Vegetable {

    protected String name;
    protected String color;
    protected int weightInPounds;
    protected int costPerPound;
    protected boolean isLeafy;

    private final boolean hasSeeds = false;
    
    // Constructor
    protected Vegetable(String name, String color, int weightInPounds, in costPerPound, boolean isSour, boolean isLeafy) {
        this.name = name;
        this.color = color;
        this.weightInPounds = weightInPounds;
        this.costPerPound = costPerPound;
        this.isLeafy = isLeafy;
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
        name, color, weightInPounds, costPerPound, isLeafy);
    }

}
