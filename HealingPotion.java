
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
    
    public boolean consume(){
        if (amountOf > 0){
            amountOf--;
            return true;
        }
        else {
            return false;
        }
    }
    
    public int getHealing(int healingFactor) {
        if (healingFactor>0){
            return healingFactor;
        }
        else {
            return 0;
        }
    }
    
    public int getDamage(int damageFactor) {
        return 0;
    }
    
    public boolean throwPotion(){
        if (amountOf > 0){
            amountOf--;
            return true;
        }
        else {
            return false;
        }
    }
}
