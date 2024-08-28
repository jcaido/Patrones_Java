package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.WizardFighterImpl;

public class Wizard extends Enemy {

    public Wizard() {
        setFighter(new WizardFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public Enemy setHealth(int health) {
        return super.setHealth(health);
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public Enemy setFighter(Fighter fighter) {
        return super.setFighter(fighter);
    }

    public void attack() {
        System.out.println("Wizard: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Wizard:");
        getFighter().protect();
    }
}
