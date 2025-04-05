
/**
 * Write a description of class Appetizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Appetizer extends Food
{
    public Appetizer(String name, String description, int amountOf, int valueOfNutrition, String[] ingredients) {
        super(name, description, amountOf, valueOfNutrition, ingredients);
    }

    public Appetizer() {
        this("Basic Breadsticks", "Kinda moldy bread", 82, 32, new String[]{"flour", "yeast", "salt", "olive oil"});
    }

    public void arrange() {
        System.out.println("The " + getName() + " has been beautifully arranged on a serving platter :).");
    }
}