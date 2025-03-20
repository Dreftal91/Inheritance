
/**
 * Write a description of class Shield here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Armor extends Defense{
    public Armor(String name, String description, int defenseValue, int durability) {
        super(name, description, defenseValue, durability);
    }
    
    public Armor() {
        super("Helmet", "Hat, but better", 30, 300);
    }
}