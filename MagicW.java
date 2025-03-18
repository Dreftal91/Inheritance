
/**
 * Write a description of class MagicW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicW  extends Weapon implements WeaponInterface
{
    int manaCost;
    public MagicW(String name, String description, int amountOfDamage, String typeOfWeapon, int amountOfDurability, int amountOfMana){
        super(name, description, amountOfDamage, typeOfWeapon, amountOfDurability);
        manaCost = amountOfMana;
    }
    
    public MagicW(){
        super("Staff", "A piece of wood with magical properties, somehow", 450, "Magic", 350);
        manaCost = 250;
    }
    
    public boolean parry(){
        int pChance = (int)(Math.random() * 10 + 1);
        return (pChance > 5);
    }
    
    public int attack(){
        System.out.println("Fireball!");
        return damage;
    }
}
