
/**
 * Write a description of class MeleeW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MeleeW extends Weapon implements WeaponInterface
{
    int attackReach;
    public MeleeW(String name, String description, int amountOfDamage, String typeOfWeapon, int amountOfDurability, int reachOfAttack){
        super(name, description, amountOfDamage, typeOfWeapon, amountOfDurability);
        attackReach = reachOfAttack;
    }

    public MeleeW(){
        super("Nunchaku", "Two little bats attached by chains", 30, "Melee", 300);
        this.attackReach = 3;
    }

    public boolean parry(){
        int pChance = (int)(Math.random() * 10 + 1);
        return (pChance > 5);
    }

    public int attack(){
        System.out.println("Attack!");
        return damage;
    }
}
