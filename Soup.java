
/**
 * Write a description of class Soup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Soup extends Food
{
    public Soup(String name, String description, int amountOf, int valueOfNutrition){
        super(name, description, amountOf, valueOfNutrition);
        
    }

    public Soup(){
        super("Basic Soup", "Mundane, ordinary, and everything plain", 17, 56);
    }
}
