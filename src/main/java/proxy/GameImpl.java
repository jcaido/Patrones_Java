package proxy;

import java.io.*;
import java.util.Date;

public class GameImpl implements Game {

    private Stats stats;

    public Stats getStats() {
        return stats;
    }

    public GameImpl setStats(Stats stats) {
        this.stats = stats;
        return this;
    }

    @Override
    public void save(String name) {
        try {
            writeObject(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Stats load(String name) {
        Stats stats = null;
        try {
            stats = (Stats) readObject(name);
            setStats(stats);
            return stats;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void newGame(String name) {
        File file = new File(name);
        Stats stats = new Stats(name, 1, 0, 0);
        stats.setCreatedAt(new Date());
        stats.setLastSave(new Date());
        setStats(stats);
        try {
            file.createNewFile();
            writeObject(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeObject(String name) throws IOException {
        FileOutputStream fos = new FileOutputStream(name);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(getStats());
        oos.close();
        fos.close();
    }

    private Object readObject(String name) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object stats = ois.readObject();
        ois.close();
        fis.close();

        return stats;
    }
}
