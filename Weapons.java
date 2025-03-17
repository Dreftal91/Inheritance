
/**
 * Write a description of class Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapons extends Item implements WeaponInterface
{
    int damage;
    String type;
    public Weapons(String name, String description, int amountOfDamage, String typeOfWeapon){
        super(name, description);
        damage = amountOfDamage;
    }
}
