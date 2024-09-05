package facade;

public interface Skills {

    static boolean getSkills(String name, boolean make) {

        String action = make ? "make" : "improve";

        if (Math.random() > 0.5) {
            System.out.println("You have the necessary skills to " + action + " the " + name);
            return true;
        } else {
            System.out.println("You have the necessary skills to " + action + " the " + name);
            return false;
        }
    }
}
