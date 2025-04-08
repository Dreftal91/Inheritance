
/**
 * Write a description of class Bakery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BakedGoods extends Food {
    public BakedGoods(String name, String description, int amountOf, int valueOfNutrition, String[] ingredients) {
        super(name, description, amountOf, valueOfNutrition, ingredients);
    }

    public BakedGoods() {
        super("Basic Baked Good", "Put some grain in the oven and voila!", 27, 64, new String[]{"flour", "yeast", "sugar"});
    }
    
    public void bake() {
        System.out.println("The " + getName() + " has been freshly baked in the oven :).");
    }
}
