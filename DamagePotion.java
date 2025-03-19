
/**
 * Write a description of class DamagePotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DamagePotion extends Potion implements PotionInterface
{
    int damageFactor;
    public DamagePotion(String name, String description, int amountOf, int magicVal, int damageFactor){
        super(name, description, amountOf, magicVal);
        this.damageFactor = damageFactor;
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
        return 0;
    }
    
    public int getDamage(int damageFactor) {
        if (damageFactor>0){
            return damageFactor;
        }
        else {
            return 0;
        }
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
