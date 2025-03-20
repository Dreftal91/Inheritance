
/**
 * Write a description of class Consumables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Consumable extends Item implements ConsumableInterface
{
    int amountOf;
    public Consumable (int amountOf){
        super(name, description);
        this.amountOf = amountOf;
    }
}
