
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
public class Food extends Consumable
{
    int nutritionVal;
    static String[] ingredientsList;
    public Food (String name, String description, int amountOf, int valueOfNutrition, String ingredients[]){
        super(name, description, amountOf);
        nutritionVal = valueOfNutrition;
    }
}
