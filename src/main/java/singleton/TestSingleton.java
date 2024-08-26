package singleton;

public class TestSingleton {

    public static void main(String[] args) {

        Player player = Player.getPlayer("Cristobal");
        System.out.println(player);

        Player player1 = Player.getPlayer("Manolo");
        System.out.println(player);
    }
}
