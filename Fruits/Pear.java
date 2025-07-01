package Fruits;

/**
 * Represents a Pear, typically not sour.
 */
public class Pear extends Fruit {

    public Pear(String name, String color, int weightInPounds, int costPerPound) {
        super(name, color, weightInPounds, costPerPound, false);
    }

    @Override
    public String toString() {
        return "Pear: " + super.toString();
    }
}
