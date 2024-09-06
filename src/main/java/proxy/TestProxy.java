package proxy;

public class TestProxy {

    public static void main(String[] args) {
        GameImpl gameImpl = new GameImpl();
        gameImpl.newGame("player1");
        ProxyGameImpl proxiGame  = new ProxyGameImpl(gameImpl);

        proxiGame.load("player1");
        System.out.println(proxiGame.getStats());

        proxiGame.getStats().setKills(10);
        proxiGame.getStats().setDeaths(2);
        proxiGame.save("player1");

        proxiGame.load("player1");
        System.out.println(proxiGame.getStats());
    }
}
