
/**
 * Write a description of class asfas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beef extends Food
{
    public Beef(String name, String description, int amountOf, int valueOfNutrition, String ingredients[]){
        super(name, description, amountOf, valueOfNutrition, ingredients);
    }

    public Beef(){
        super("Basic Beef", "Not even sure the cow was healthy", 28, 53, ingredients);
    }
}
