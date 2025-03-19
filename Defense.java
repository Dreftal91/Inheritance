
/**
 * Write a description of class Defense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Defense extends Item implements DefenseCommands {
    protected int defenseValue;
    protected int durability;

    public Defense(String name, String description, int defenseValue, int durability) {
        super(name, description);
        this.defenseValue = defenseValue;
        this.durability = durability;
    }
}