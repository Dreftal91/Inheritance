
/**
 * Write a description of class RangedW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RangedW extends Weapon implements WeaponInterface
{
    int Range;
    public RangedW(String name, String description, int amountOfDamage, String typeOfWeapon, int amountOfDurability, int Range){
        super(name, description, amountOfDamage, typeOfWeapon, amountOfDurability);
        this.Range = Range;
    }
    
    public RangedW(){
        super("Longbow", "A bow that's long, duh", 30, "Ranged", 200);
        this.Range = 200;
    }
    
    public boolean parry(){
        int pChance = (int)(Math.random() * 10 + 1);
        return (pChance > 5);
    }
    
    public int attack(){
        System.out.println("Arrow Attack!");
        return damage;
    }
}
