package adapter;

public class TestAdapter {

    public static void main(String[] args) {

        //Enemy warrior = new Warrior();
        //Enemy wizard = new Wizard();
        //Enemy dragon = new DragonAdapter();

        //warrior.attack();
        //warrior.damage();
        //System.out.println("==========================");

        //wizard.attack();
        //wizard.damage();
        //System.out.println("============================");

        //dragon.attack();
        //dragon.damage();

        Enemy warrior = new Warrior();
        Enemy wizard = new Wizard();
        Enemy dragon = new DragonAdapter(new Dragon());

        warrior.attack();
        warrior.damage();
        System.out.println("==========================");

        wizard.attack();
        wizard.damage();
        System.out.println("==========================");

        dragon.attack();
        dragon.damage();

    }
}
