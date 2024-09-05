package facade;

public class Workbench implements Smithy{

    public static final String ACTION = "improve";

    @Override
    public void work(String name) {
        System.out.println("let's " + ACTION + " the " + name + " ...");
    }

    @Override
    public boolean search(String name) {
        return Stock.search(name, false);
    }

    @Override
    public void remove(String name) {
        Stock.remove(name, false);
    }

    @Override
    public void working(String name) {
        System.out.println("improving " + name);
    }
}
