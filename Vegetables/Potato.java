package Vegetables;

public class Potato extends Vegetable {
    
    public Potato(String name, String color, int weightInPounds, int costPerPound, boolean isLeafy) {
        super(name, color, weightInPounds, costPerPound, isLeafy);
    }

    @Override
    public String toString() {
        return "Potato: " + super.toString();
    }    
}
