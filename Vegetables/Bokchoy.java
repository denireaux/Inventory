package Vegetables;

public class Bokchoy extends Vegetable {

    public Bokchoy(String name, String color, int weightInPounds, int costPerPound, boolean isLeafy) {
        super(name, color, weightInPounds, costPerPound, isLeafy);
    }

    @Override
    public String toString() {
        return "Bokchoy: " + super.toString();
    }
    
}
