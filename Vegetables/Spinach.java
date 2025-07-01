package Vegetables;

public class Spinach extends Vegetable {

    public Spinach(String name, String color, int weightInPounds, int costPerPound, boolean isLeafy) {
        super(name, color, weightInPounds, costPerPound, isLeafy);
    }

    @Override
    public String toString() {
        return "Spinach: " + super.toString();
    }
}
