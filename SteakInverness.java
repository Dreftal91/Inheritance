
/**
 * Write a description of class asd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SteakInverness extends Beef {
    public SteakInverness() {
        super("Steak Inverness", "A Scottish specialty with steak topped with a whisky cream sauce", 1, 75, new String[]{"ribeye steak", "Scotch whisky", "heavy cream", "mushrooms", "butter", "thyme"});
    }
    
    public void ageSteak() {
        System.out.println("You dry-aged the " + getName() + " for enhanced flavor.");
        nutritionVal += 10;
        System.out.println("Flavor intensified, nutrition value up by 10.");
    }
}