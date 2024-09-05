package facade;

public interface Stock {

    static boolean search(String name, boolean make) {
        String action = make ? "make" : "improve";

        if (Math.random() > 0.5) {
            System.out.println("You have the necessary materials to " + action + " the " + name);
            return true;
        } else {
            System.out.println("You don't have the necessary materials to " + action + " the " + name);
            return false;
        }
    }

    static void remove(String name, boolean make) {
        String action = make ? "make" : "improve";

        System.out.println("removing from your stock the materials used to " + action + " the " + name);
    }
}
