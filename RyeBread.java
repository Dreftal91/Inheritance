
/**
 * Write a description of class asd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RyeBread extends BakedGoods {
    public RyeBread() {
        super("Rye Bread", "Dense, hearty bread with (Nick?) caraway seeds", 12, 45, new String[]{"rye flour", "bread flour", "caraway seeds", "yeast", "salt", "molasses"});
    }
    
    public void scoreTop() {
        System.out.println("You score the top of the " + getName() + " with a decorative pattern.");
        nutritionVal += 2;
        System.out.println("Presentation improved, nutrition value up by 2.");
    }
}