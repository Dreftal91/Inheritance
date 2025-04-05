
/**
 * Write a description of class kjasd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CrownRoastOfLamb extends Lamb {
    public CrownRoastOfLamb() {
        super("Crown Roast of Lamb", "Elegant rack of lamb formed into a crown and roasted", 8, 80, new String[]{"rack of lamb", "garlic", "rosemary", "mint", "olive oil", "salt", "pepper"});
    }
    
    public void formCrown() {
        System.out.println("You carefully form the " + getName() + " into an impressive crown shape.");
        nutritionVal += 5;
        System.out.println("Presentation enhanced, nutrition value up by 5.");
    }
}