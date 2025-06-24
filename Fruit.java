
/**
* This is an abstract class for fruit to be inherit by specific fruits
* @author Susan S. Bai, D'Angelo L. DeNiro
*/
public class Fruit {

    protected String name;
    private final boolean hasSeeds = true;

    String color;
    int weightInPounds;
    int costPerPound;


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
    }

    // Considering we have a weightInPounds,
    // and a costPerPound, we probably need,
    // a class method that will take whatever,
    // values those are, and determine a,
    // sellingPrice
    public int sellingPrice(int weightInPound, int costPerPound) {
        return 0;
    }
}