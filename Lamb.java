
/**
 * Write a description of class alsjf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lamb extends Food
{
    public Lamb(String name, String description, int amountOf, int valueOfNutrition, String ingredients[]){
        super(name, description, amountOf, valueOfNutrition, ingredients);
    }

    public Lamb(){
        super("Basic Lamb", "Pretty old, wouldn't try it myself", 17, 26, ingredients);
    }
}
