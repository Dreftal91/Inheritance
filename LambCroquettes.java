
/**
 * Write a description of class asf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LambCroquettes extends Lamb {
    public LambCroquettes() {
        super("Lamb Croquettes", "Crispy fried lamb patties with herbs and spices", 8, 50, new String[]{"ground lamb", "breadcrumbs", "eggs", "mint", "parsley", "lemon zest", "flour"});
    }
    
    public void deepFry() {
        System.out.println("You deep fry the " + getName() + " to a golden crisp exterior.");
        nutritionVal += 4;
        System.out.println("Crispiness achieved, nutrition value up by 4.");
    }
}