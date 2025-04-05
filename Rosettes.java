
/**
 * Write a description of class kakls here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rosettes extends BakedGoods {
    public Rosettes() {
        super("Rosettes", "Delicate, crisp pastries dusted with sugar", 24, 30, new String[]{"flour", "eggs", "sugar", "milk", "vanilla", "powdered sugar"});
    }
    
    public void dustWithSugar() {
        System.out.println("You dust the " + getName() + " with a fine layer of powdered sugar.");
        nutritionVal += 13;
        System.out.println("Sweetness enhanced, nutrition value up by 13.");
    }
}