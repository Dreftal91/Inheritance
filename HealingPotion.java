
/**
 * Write a description of class HealingPotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HealingPotion extends Potion
{
    int healingFactor;
    public HealingPotion (String name, String description, int amountOf, int magicVal, int healingFactor) {
        super(name, description, amountOf, magicVal);
        this.healingFactor = healingFactor;
    }
}
