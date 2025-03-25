
/**
 * Write a description of class DamagePotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DamagePotion extends Potion
{
    int damageFactor;
    public DamagePotion(String name, String description, int amountOf, int magicVal, int damageFactor){
        super(name, description, amountOf, magicVal);
        this.damageFactor = damageFactor;
    }
}
