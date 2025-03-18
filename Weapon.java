
/**
 * Write a description of class Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    int damage;
    String type;
    int durability;
    public Weapon(String name, String description, int amountOfDamage, String typeOfWeapon, int amountOfDurability){
        super(name, description);
        damage = amountOfDamage;
        type = typeOfWeapon;
        durability = amountOfDurability;
    }
    
    public Weapon(){
        super("Shortsword", "It's about the motion of the ocean, not the size of the wave");
        damage = 25;
        type = "Melee";
        durability = 50;
    }
}
