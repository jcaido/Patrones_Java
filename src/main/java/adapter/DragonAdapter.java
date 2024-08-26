package adapter;

public class DragonAdapter implements Enemy{

    private Dragon dragon = new Dragon();

    @Override
    public void attack() {
        dragon.fireDestroy();
    }

    @Override
    public void damage() {
        System.out.println("dragon damage!!");
    }
}
