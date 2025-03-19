
/**
 * Write a description of class Shield here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Armor extends Defense implements DefenseCommands {
    public Armor(String name, String description, int defenseValue, int durability) {
        super(name, description, defenseValue, durability);
    }
    
    public Armor() {
        super("Helmet", "Hat, but better", 30, 300);
    }

    public boolean blocked() {
        if (durability > 0) {
            durability--;
            return true;
        }
        return false;
    }

    public void repair(int amount) {
        this.durability += amount;
    }
}