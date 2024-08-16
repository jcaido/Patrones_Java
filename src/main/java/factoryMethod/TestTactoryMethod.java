package factoryMethod;

public class TestTactoryMethod {

    public static void main(String[] args) {

        Enemy warrior1 = new WarriorFactory().createEnemy();
        Enemy wizard1 = new WizardFactory().createEnemy();

        warrior1.attack();
        wizard1.attack();
    }
}
