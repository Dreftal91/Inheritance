
/**
 * Write a description of class Potions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Potion extends Consumable implements PotionInterface
{
    int magicVal;
    public Potion (String name, String description, int amountOf, int valueOfMagic){
        super(name, description, amountOf);
        magicVal = valueOfMagic;
    }
}
