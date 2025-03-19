
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Food extends Consumable implements ConsumableInterface
{
    int nutritionVal;
    public Food (String name, String description, int price, int valueOfNutrition){
        super(name, description, price);
        nutritionVal = valueOfNutrition;
    }
}
