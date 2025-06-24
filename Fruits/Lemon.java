package Fruits;

class Lemon extends Fruit {
    
    public Lemon(String name, String color, int weightInPounds, int costPerPound, boolean isSour) {
        super(name, color, weightInPounds, costPerPound);
    }

    private boolean isSour = true;
}
