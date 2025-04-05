
/**
 * Write a description of class asdlj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VealFricassee extends Veal {
    public VealFricassee() {
        super("Veal Fricassee", "Veal stewed in a creamy white sauce with vegetables", 4, 55, new String[]{"veal shoulder", "carrots", "mushrooms", "onions", "white wine", "cream", "parsley"});
    }
    
    public void slowCook() {
        System.out.println("You slow cook the " + getName() + " until fork-tender.");
        nutritionVal += 7;
        System.out.println("Tenderness improved, nutrition value up by 7.");
    }
}