
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

    public int sip() {
        if (amountOf > 0) {
            amountOf--;
            System.out.println("You take a small sip of the " + getName() + ".");
            return healingFactor / 3;
        } else {
            System.out.println("The potion is empty!");
            return 0;
        }
    }
}
