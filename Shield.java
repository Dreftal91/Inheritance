
/**
 * Write a description of class Shield here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Shield extends Defense implements DefenseCommands {
    public Shield(String name, String description, int defenseValue, int durability) {
        super(name, description, defenseValue, durability);
    }
    
    public Shield() {
        super("Spike Shield", "A shield, but offensive", 57, 500);
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