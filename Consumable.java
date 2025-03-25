
/**
 * Write a description of class Consumables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Consumable extends Item
{
    int amountOf;
    public Consumable (String name, String description, int amountOf){
        super(name, description);
        this.amountOf = amountOf;
    }
    
    public boolean consume(){
        if (amountOf > 0){
            amountOf--;
            return true;
        }
        else {
            return false;
        }
    }
}
