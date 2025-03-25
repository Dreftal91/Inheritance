
/**
 * Write a description of class Potions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Potion extends Consumable
{
    int magicVal;
    public Potion (String name, String description, int amountOf, int valueOfMagic){
        super(name, description, amountOf);
        magicVal = valueOfMagic;
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
