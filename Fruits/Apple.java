package Fruits;

/**
 * Represents an Apple, a specific type of Fruit.
 * Apples are not sour by default.
 */
public class Apple extends Fruit {

    public Apple(String name, String color, int weightInPounds, int costPerPound) {
        super(name, color, weightInPounds, costPerPound, false);
    }

    @Override
    public String toString() {
        return "Apple: " + super.toString();
    }
    
    public static void main(String[] args) {
        Apple ourApple = new Apple("Apple", "Yellow", 2, 1);
        String ourAppleInfo = ourApple.toString();

        System.out.println(ourAppleInfo);
    }
    
}
