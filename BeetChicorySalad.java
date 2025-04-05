
/**
 * Write a description of class as here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BeetChicorySalad extends Salads {
    public BeetChicorySalad() {
        super("Beet and Chicory Salad", "A colorful salad with earthy beets and slightly bitter chicory", 4, 38, new String[]{"beets", "chicory", "goat cheese", "walnuts", "balsamic vinegar", "olive oil"});
    }
    
    public void roastBeets() {
        System.out.println("You roasted the beets to enhance sweetness in the " + getName() + ".");
        nutritionVal += 7;
        System.out.println("Nutrition value increased by 7.");
    }
}
