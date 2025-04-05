
/**
 * Write a description of class kjsahf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BearClaws extends BakedGoods {
    public BearClaws() {
        super("Bear Claws", "Sweet almond pastry with a flaky texture", 8, 55, new String[]{"puff pastry", "almond paste", "sugar", "eggs", "sliced almonds", "powdered sugar"});
    }
    
    public void brushWithGlaze() {
        System.out.println("You brush the " + getName() + " with a sweet glaze while still warm.");
        nutritionVal += 5;
        System.out.println("Flavor enhanced, nutrition value up by 5.");
    }
}