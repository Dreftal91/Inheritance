
/**
 * Write a description of class Soup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Soup extends Food
{
    public Soup(String name, String description, int amountOf, int valueOfNutrition, String ingredients[]){
        super(name, description, amountOf, valueOfNutrition, ingredients);
    }

    public Soup(){
        super("Basic Soup", "Mundane, ordinary, and everything plain", 17, 56, ingredients);
    }
}
