package factory;

public class TestFactory {

    public static void main(String[] args) {

        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy warrior1 = enemyFactory.createEnemy("warrior");
        Enemy wizard1 = enemyFactory.createEnemy("wizard");
        warrior1.attack();
        wizard1.attack();
    }
}
