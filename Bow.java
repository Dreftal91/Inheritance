
/**
 * Write a description of class RangedW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bow extends Weapon
{
    int Range;
    public Bow(String name, String description, int amountOfDamage, String typeOfWeapon, int amountOfDurability, int Range){
        super(name, description, amountOfDamage, typeOfWeapon, amountOfDurability);
        this.Range = Range;
    }

    public Bow(){
        super("Longbow", "A bow that's long, duh", 30, "Ranged", 200);
        this.Range = 200;
    }

    public int damageAtDistance(int distance) {
        int effectiveDamage = damage;
        if (distance > Range) {
            effectiveDamage = 0;
            System.out.println("Target out of range!");
        } else {
            int damageReduction = (int)(distance * 0.1);
            effectiveDamage -= damageReduction;
            System.out.println("Damage reduced by " + damageReduction + " due to distance.");
        }
        return effectiveDamage;
    }
}
