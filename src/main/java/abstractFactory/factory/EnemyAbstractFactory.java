package abstractFactory.factory;

import abstractFactory.armor.Armor;
import abstractFactory.enemy.Enemy;
import abstractFactory.weapon.Weapon;

public abstract class EnemyAbstractFactory {

    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
