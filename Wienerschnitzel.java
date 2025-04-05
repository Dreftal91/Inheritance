
/**
 * Write a description of class asd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wienerschnitzel extends Veal {
    public Wienerschnitzel() {
        super("Wienerschnitzel", "Traditional Austrian breaded veal cutlet", 2, 60, new String[]{"veal cutlet", "flour", "eggs", "breadcrumbs", "lemon", "parsley", "butter"});
    }
    
    public void poundThin() {
        System.out.println("You pound the " + getName() + " until paper-thin.");
        nutritionVal += 3;
        System.out.println("Texture improved, nutrition value up by 3.");
    }
}