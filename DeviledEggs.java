
/**
 * Write a description of class askj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeviledEggs extends Appetizer {
    public DeviledEggs() {
        super("Deviled Eggs", "Classic deviled eggs with a touch of paprika", 12, 40, new String[]{"eggs", "mayonnaise", "mustard", "paprika", "salt", "pepper"});
    }
    
    public void sprinklePaprika() {
        System.out.println("Added an extra sprinkle of paprika for presentation!");
    }
}