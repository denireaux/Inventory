public class Fruit {

    protected String name;
    protected final boolean hasSeeds = true;

    String color;
    float weight;
    float price;
    

    // Constructor
    protected Fruit(String name, String color, float weight, float price) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }
    
}