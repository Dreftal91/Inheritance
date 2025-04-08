
/**
 * Write a description of class askjh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pork extends Food {
    public Pork(String name, String description, int amountOf, int valueOfNutrition, String[] ingredients) {
        super(name, description, amountOf, valueOfNutrition, ingredients);
    }

    public Pork() {
        super("Basic Pork", "Probably didn't get oats from his brother.", 12, 49, new String[]{"pork", "oats", "salt"});
    }
    
    public void roast() {
        System.out.println("The " + getName() + " has been roasted :).");
    }
}
