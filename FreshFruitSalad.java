
/**
 * Write a description of class asdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FreshFruitSalad extends Appetizer {
    public FreshFruitSalad() {
        super("Fresh Fruit Salad", "A refreshing mix of seasonal fruits", 5, 25, new String[]{"strawberries", "blueberries", "melon", "grapes", "honey"});
    }
    
    public void addExtraHoney() {
        System.out.println("Added extra honey to the fruit salad!");
    }
}
