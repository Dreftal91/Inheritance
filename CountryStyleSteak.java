
/**
 * Write a description of class as here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountryStyleSteak extends Beef {
    public CountryStyleSteak() {
        super("Country Style Steak", "A tenderized steak smothered in gravy", 2, 65, new String[]{"beef cube steak", "flour", "salt", "pepper", "beef broth", "onions"});
    }
    
    public void tenderizeWithMallet() {
        System.out.println("You tenderize the " + getName() + " with a meat mallet.");
        nutritionVal += 5;
        System.out.println("Tenderness increased, nutrition value up by 5.");
    }
}