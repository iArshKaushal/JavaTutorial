package org.akk.oop2_advance.q_java_io.b_random_access_file;

import java.io.IOException;
import java.io.RandomAccessFile;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;

public class Ex2GameSave {
    public static String FILE = ROOT_FILE_PATH + "gamestate.dat";

    public static void main(String[] args) throws IOException {
        GameState gameState = new GameState("Ashwani Kumar", 34, 2344, 77.5);
        gameState.saveGameState();

        System.out.println("=== INITIAL SAVE ===");
        GameState loaded = GameState.loadGameState();
        loaded.print();

        System.out.println("\n=== UPDATING ONLY HEALTH ===");
        GameState.updateHealth(65.2);

        GameState updated = GameState.loadGameState();
        updated.print();
    }
}


class GameState {
    private String playerName;
    private int level;
    private int score;
    private double health;

    public GameState(String playerName, int level, int score, double health) {
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.health = health;
    }


    public void saveGameState() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(Ex2GameSave.FILE, "rw");

        raf.writeUTF(playerName);
        raf.writeInt(level);
        raf.writeInt(score);
        raf.writeDouble(health);
        raf.close();
    }


    // --------------------------
    // LOAD COMPLETE STATE
    // --------------------------
    public static GameState loadGameState() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(Ex2GameSave.FILE, "r");

        String playerName = raf.readUTF();
        int level = raf.readInt();
        int score = raf.readInt();
        double health = raf.readDouble();

        raf.close();
        return new GameState(playerName, level, score, health);
    }


    // --------------------------
    // UPDATE ONLY HEALTH
    // --------------------------
    public static void updateHealth(double newHealth) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(Ex2GameSave.FILE, "rw");

        raf.seek(0);
        raf.readUTF(); // skip playerName (variable length)
        raf.readInt(); // skip level
        raf.readInt(); // skip score

        // Now we reached health location
        raf.writeDouble(newHealth);

        raf.close();

    }

    public void print() throws IOException {
        System.out.println("Player Name: " + playerName);
        System.out.println("Level: " + level);
        System.out.println("Score: " + score);
        System.out.println("Health: " + health);
    }
}