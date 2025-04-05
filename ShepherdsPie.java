
/**
 * Write a description of class asf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShepherdsPie extends Lamb {
    public ShepherdsPie() {
        super("Shepherd's Pie", "Traditional casserole with minced lamb and mashed potato topping", 6, 65, new String[]{"ground lamb", "potatoes", "carrots", "peas", "onions", "rosemary", "Worcestershire sauce"});
    }
    
    public void browPotatoes() {
        System.out.println("You create perfect ridges in the potato topping of the " + getName() + " and brown under the broiler.");
        nutritionVal += 7;
        System.out.println("Texture improved, nutrition value up by 7.");
    }
}