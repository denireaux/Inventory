package Fruits;

/**
 * Represents a Lemon, which is typically sour.
 */
public class Lemon extends Fruit {

    public Lemon(String name, String color, int weightInPounds, int costPerPound) {
        super(name, color, weightInPounds, costPerPound, true);
    }

    @Override
    public String toString() {
        return "Lemon: " + super.toString();
    }
}
