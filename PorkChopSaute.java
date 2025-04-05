
/**
 * Write a description of class aslkdja here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PorkChopSaute extends Pork {
    public PorkChopSaute() {
        super("Pork Chop Saute", "Pork chops with a flavorful pan sauce", 2, 60, new String[]{"pork chops", "butter", "garlic", "thyme", "chicken stock", "lemon juice"});
    }
    
    public void deglaze() {
        System.out.println("You deglaze the pan after cooking the " + getName() + " to create a rich sauce.");
        nutritionVal += 5;
        System.out.println("Flavor enhanced, nutrition value up by 5.");
    }
}