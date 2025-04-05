
/**
 * Write a description of class lskjfa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OystersOnHalfShell extends Appetizer {
    public OystersOnHalfShell() {
        super("Oysters on the Half Shell", "Fresh oysters served with lemon and mignonette sauce", 6, 35, new String[]{"oysters", "lemon", "shallots", "vinegar", "pepper"});
    }
    
    public void addHotSauce() {
        System.out.println("Added a dash of hot sauce to the oysters!");
    }
}
