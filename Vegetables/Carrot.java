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

// Several Issues:
// 1. Potato constructor implemented
// 2. Main method in Carrot class
// 3. Formatting, 
//      a. Every class should have one new-line in between package declaration and class declaration
//      b. In between class methods/constructors/everything really, there should be one new line
//      c. Every class should have one new-line at the very bottom of the class (one extra line)
//      d. Please remove this entire comment before pushing