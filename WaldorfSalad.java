
/**
 * Write a description of class jas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaldorfSalad extends Salads {
    public WaldorfSalad() {
        super("Waldorf Salad", "A classic salad with apples, celery, and walnuts in a creamy dressing", 6, 45, new String[]{"apples", "celery", "walnuts", "grapes", "mayonnaise", "lemon juice", "lettuce"});
    }
    
    public void addExtraWalnuts() {
        System.out.println("You add extra toasted walnuts to the " + getName() + ".");
        nutritionVal += 5;
        System.out.println("Nutrition value increased by 5.");
    }
}