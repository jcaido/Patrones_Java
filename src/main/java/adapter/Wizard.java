package adapter;

public class Wizard implements Enemy{
    @Override
    public void attack() {
        System.out.println("wizard attack!!");
    }

    @Override
    public void damage() {
        System.out.println("wizard damage!!");
    }
}
