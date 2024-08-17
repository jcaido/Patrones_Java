package abstractFactory;

import abstractFactory.armor.Armor;
import abstractFactory.enemy.Enemy;
import abstractFactory.factory.EnemyAbstractFactory;
import abstractFactory.factory.WarriorFactory;
import abstractFactory.factory.WizardFactory;
import abstractFactory.weapon.Weapon;

public class TestAbstractFactory {

    public static void main(String[] args) {

        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();
        warrior.attack();
        weapon.damage();
        armor.protect();

        EnemyAbstractFactory factory1 = new WizardFactory();
        Enemy warrior1 = factory1.createEnemy();
        Weapon weapon1 = factory1.createWeapon();
        Armor armor1 = factory1.createArmor();
        warrior1.attack();
        weapon1.damage();
        armor1.protect();
    }

}
