package abstractFactory.factory;

import abstractFactory.armor.Armor;
import abstractFactory.armor.Robe;
import abstractFactory.enemy.Enemy;
import abstractFactory.enemy.Wizard;
import abstractFactory.weapon.Weapon;
import abstractFactory.weapon.WizardStaff;

public class WizardFactory extends EnemyAbstractFactory{

    @Override
    public Enemy createEnemy() {
        return new Wizard();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
