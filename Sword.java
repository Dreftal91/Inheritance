
/**
 * Write a description of class MeleeW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sword extends Weapon
{
    int attackReach;
    public Sword(String name, String description, int amountOfDamage, String typeOfWeapon, int amountOfDurability, int reachOfAttack){
        super(name, description, amountOfDamage, typeOfWeapon, amountOfDurability);
        attackReach = reachOfAttack;
    }

    public Sword(){
        super("Claymore", "Your average Scottish sword.", 30, "Melee", 300);
        this.attackReach = 3;
    }
}
