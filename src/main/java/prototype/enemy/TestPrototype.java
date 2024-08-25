package prototype.enemy;

public class TestPrototype {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior(100, 100, 100);
        Warrior warrior2 = (Warrior) warrior1.clone();
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("===================================");
        warrior2.setHealth(0);
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("===================================");
        Wizard wizard1 = new Wizard(100, 100, 100);
        Wizard wizard2 = (Wizard) wizard1.clone();
        System.out.println(wizard1);
        System.out.println(wizard2);
        System.out.println("===================================");
        wizard2.setHealth(0);
        System.out.println(wizard1);
        System.out.println(wizard2);
    }
}
