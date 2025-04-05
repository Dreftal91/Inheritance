
/**
 * Write a description of class as here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrangeWatercressSalad extends Salads {
    public OrangeWatercressSalad() {
        super("Orange and Watercress Salad", "A salad with orange pieces and watercress, whatever that is", 4, 35, new String[]{"watercress", "orange segments", "red onion", "olive oil", "lemon juice", "salt", "pepper"});
    }
    
    public void addCitrusDressing() {
        System.out.println("You drizzle citrus (when life gives you lemons) dressing over the " + getName() + ".");
        nutritionVal += 5;
        System.out.println("Nutrition value increased by 5!");
    }
}