
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

    public int splash() {
        if (consume()) {
            System.out.println("You splash (minecraft?) the " + getName() + "!");
            return magicVal * damageFactor / 2;
        } else {
            System.out.println("You have no more potions to throw!");
            return 0;
        }
    }
}
