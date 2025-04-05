
/**
 * Write a description of class as here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpanishSteak extends Beef {
    public SpanishSteak() {
        super("Spanish Steak", "Steak served with a tomato and pepper sauce", 2, 70, new String[]{"sirloin steak", "tomatoes", "bell peppers", "onions", "garlic", "paprika", "olive oil"});
    }
    
    public void flambe() {
        System.out.println("You dramatically flambe the " + getName() + " with a splash of sherry.");
        nutritionVal += 6;
        System.out.println("Flavor enhanced, nutrition value up by 6.");
    }
}
