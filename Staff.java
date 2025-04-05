
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

    public int castSpell(int manaAvailable) {
        if (manaAvailable >= manaCost) {
            System.out.println("You cast a silly spell with your " + getName() + "!");
            return damage * 2;
        } else {
            System.out.println("Not enough mana to cast a spell, silly!");
            return 0;
        }
    }
}
