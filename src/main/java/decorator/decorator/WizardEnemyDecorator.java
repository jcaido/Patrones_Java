package decorator.decorator;

import decorator.Enemy;

public class WizardEnemyDecorator extends EnemyDecorator{

    public WizardEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Wizard attack!!");
    }
}
