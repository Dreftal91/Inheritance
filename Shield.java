
/**
 * Write a description of class Shield here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Shield extends Defense{
    public Shield(String name, String description, int defenseValue, int durability) {
        super(name, description, defenseValue, durability);
    }

    public Shield() {
        super("Spike Shield", "A shield, but offensive", 57, 500);
    }

    public void bash() {
        System.out.println("You bashed with your " + getName() + "you deal some damage!");
    }

    public void brace() {
        System.out.println("You brace your " + getName() + ".");
        int bonusDefense = (int)(defenseValue * 0.5);
        System.out.println("Defense temporarily increased by " + bonusDefense + "!");
    }
}