
/**
 * Write a description of class alksf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salads extends Food {
    public Salads(String name, String description, int amountOf, int valueOfNutrition, String[] ingredients) {
        super(name, description, amountOf, valueOfNutrition, ingredients);
    }

    public Salads() {
        super("Basic Salad", "Literally just grass with tomato", 3, 41, new String[]{"lettuce", "tomato", "cucumber"});
    }

    public void toss() {
        System.out.println("The " + getName() + " has been tossed with fresh dressing :).");
    }
}
