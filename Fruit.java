
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

    public int sellingPrice(int weightInPounds, int costPerPound) {
        int sellingPrice = weightInPounds * costPerPound;
        return sellingPrice;
    }
}