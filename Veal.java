
/**
 * Write a description of class kashf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Veal extends Food {
    public Veal(String name, String description, int amountOf, int valueOfNutrition, String[] ingredients) {
        super(name, description, amountOf, valueOfNutrition, ingredients);
    }

    public Veal() {
        super("Basic Veal", "Pretty sure the calf was a newborn...", 1, 47, new String[]{"veal", "milk", "honey"});
    }
    
    public void braise() {
        System.out.println("The " + getName() + " has been slow-cooked in a rich sauce :).");
    }
}
