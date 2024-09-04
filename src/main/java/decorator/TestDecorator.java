package decorator;

import adapter.Warrior;
import decorator.decorator.AssassinEnemyDecorator;
import decorator.decorator.WarriorEnemyDecorator;
import decorator.decorator.WizardEnemyDecorator;
import decorator.race.Elf;
import decorator.race.Human;

public class TestDecorator {

    public static void main(String[] args) {

        System.out.println("==================== HUMAN WARRIOR =======================");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();

        System.out.println("==================== HUMAN WARRIOR WIZARD =======================");
        Enemy humanWarriorWizard = new WarriorEnemyDecorator(new WizardEnemyDecorator(new Human()));
        humanWarriorWizard.attack();

        System.out.println("==================== ELF WARRIOR WIZARD ASSASSIN =======================");
        Enemy elfWarriorWizardAssassin = new WarriorEnemyDecorator(new WizardEnemyDecorator(new AssassinEnemyDecorator(new Elf())));
        elfWarriorWizardAssassin.attack();
    }
}
