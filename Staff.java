
/**
 * Write a description of class MagicW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff  extends Weapon
{
    int manaCost;
    public Staff(String name, String description, int amountOfDamage, String typeOfWeapon, int amountOfDurability, int amountOfMana){
        super(name, description, amountOfDamage, typeOfWeapon, amountOfDurability);
        manaCost = amountOfMana;
    }
    
    public Staff(){
        super("Fire Staff", "A piece of wood with magical properties, somehow", 450, "Magic", 350);
        manaCost = 250;
    }
}
