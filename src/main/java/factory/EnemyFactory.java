package factory;

public class EnemyFactory {

    public Enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("warrior"))
            return new Warrior();
        else if (type.equalsIgnoreCase("wizard"))
            return new Wizard();
        else
            return null;
    }
}
