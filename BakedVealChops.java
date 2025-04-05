
/**
 * Write a description of class asd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BakedVealChops extends Veal {
    public BakedVealChops() {
        super("Baked Veal Chops", "Veal chops baked with herbs and white wine", 2, 65, new String[]{"veal chops", "white wine", "herbs", "garlic", "olive oil", "lemon zest"});
    }
    
    public void marinate() {
        System.out.println("You marinate the " + getName() + " in herbs and wine overnight.");
        nutritionVal += 8;
        System.out.println("Flavor enhanced, nutrition value up by 8.");
    }
}
