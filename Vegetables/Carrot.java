package Vegetables;



public class Carrot extends Vegetable {
    
    public Potato(String name, String color, int costPerPound, int weightInPounds){
        super(name, color, weightInPounds, costPerPound, isLeafy:false);
    }



     @Override
    public String toString() {
        return "Carrot: " + super.toString();
    }

    public static void main(String[] args) {
        Potato ourCarrot = new Carrot("Carrot", "orange", 1, 4);
        String ourCarrotInfo = ourCarrot.toString();

        System.out.println(ourCarrotInfo);
    }
    
}
