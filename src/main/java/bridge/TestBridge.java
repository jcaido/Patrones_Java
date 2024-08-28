package bridge;

import bridge.enemy.Warrior;
import bridge.enemy.Wizard;
import bridge.fighter.WarriorFighterImpl;
import bridge.fighter.WizardFighterImpl;

public class TestBridge {

    public static void main(String[] args) {

        System.out.println("================== WARRIOR ==============================");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new WizardFighterImpl());
        warrior.attack();
        warrior.protect();

        System.out.println("================== WIZARD ==============================");
        Wizard wizard = new Wizard();
        wizard.attack();
        wizard.protect();
        wizard.setFighter(new WarriorFighterImpl());
        wizard.attack();
        wizard.protect();

    }
}
