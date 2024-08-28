package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.WarriorFighterImpl;

public class Warrior extends Enemy {

    public Warrior() {
        setFighter(new WarriorFighterImpl());
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
        System.out.println("warrior: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("warrior: ");
        getFighter().protect();
    }
}
