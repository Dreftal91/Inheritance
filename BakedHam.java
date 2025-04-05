
/**
 * Write a description of class skf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BakedHam extends Pork {
    public BakedHam() {
        super("Baked Ham", "Juicy baked ham with a sweet and spiced glaze", 10, 70, new String[]{"ham", "brown sugar", "mustard", "cloves", "pineapple", "cinnamon"});
    }
    
    public void scoreAndStud() {
        System.out.println("You score the " + getName() + " in a diamond pattern and stud with cloves.");
        nutritionVal += 3;
        System.out.println("Presentation improved, nutrition value up by 3.");
    }
}