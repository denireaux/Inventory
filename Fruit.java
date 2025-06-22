
/**
* This is an abstract class for fruit to be inherit by specific fruits
* @author         Susan S. Bai, D'Angelo L. DeNiro
*/
public class Fruit {

    protected String name;
    private final boolean hasSeeds = true;

    String color;
    float weight;
    int salesPrice;
    int costPrice;

    // Constructor
    protected Fruit(
        String name, 
        String color, 
        float weight, 
        int salesPrice, 
        int costPrice
        ) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.salesPrice = salesPrice;
        this.costPrice = costPrice;
    }
    
}