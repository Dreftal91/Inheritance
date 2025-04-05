
/**
 * Write a description of class kajsd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HoneyGlazedPorkChop extends Pork {
    public HoneyGlazedPorkChop() {
        super("Honey Glazed Pork Chop", "Pork chops with a sweet and savory honey glaze", 2, 65, new String[]{"pork chops", "honey", "soy sauce", "garlic", "rosemary", "olive oil"});
    }
    
    public void caramelize() {
        System.out.println("You caramelize the honey glaze on the " + getName() + ".");
        nutritionVal += 8;
        System.out.println("Sweetness enhanced, nutrition value up by 8.");
    }
}