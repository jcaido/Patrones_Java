package prototype;

public class Wizard extends Enemy{

    private int mana;

    public Wizard(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    public Wizard(Wizard wizard) {
        super(wizard);
        if (wizard != null)
            setMana(wizard.getMana());
    }

    @Override
    public Enemy clone() {
        return new Wizard(this);
    }

    public int getMana() {
        return mana;
    }
    public Wizard setMana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
