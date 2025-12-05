package org.akk.oop2_advance.q_java_io.b_random_access_file;

import java.io.RandomAccessFile;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


public class Ex3FixedLengthStructureRAF {

    public static String FILE = ROOT_FILE_PATH + "fixedgamestate.dat";

    // fixed lengths
    public static final int NAME_LENGTH = 30;
    public static final int LEVEL_OFFSET = NAME_LENGTH;
    public static final int SCORE_OFFSET = LEVEL_OFFSET + 4;
    public static final int HEALTH_OFFSET = SCORE_OFFSET + 4;


    public static void main(String[] args) throws Exception {
        GameState2 gs = new GameState2("Ashwani Kumar Kaushal from Chunni", 10, 2500, 92.5);
        gs.save();

        System.out.println("=== LOADED GAME STATE ===");
        GameState2 loaded = GameState2.load();
        loaded.print();

        System.out.println("\n=== UPDATE ONLY HEALTH ===");
        GameState2.updateHealth(61.3);
        GameState2.load().print();
    }
}




class GameState2 {

    private String playerName;
    private int level;
    private int score;
    private double health;

    public GameState2(String playerName, int level, int score, double health) {
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.health = health;
    }

    // SAVE FIXED-LENGTH RECORD
    public void save() throws Exception {
        RandomAccessFile raf = new RandomAccessFile(Ex3FixedLengthStructureRAF.FILE, "rw");

        raf.seek(0);

        // write fixed-length name
        raf.write(FixedLengthUtils.toFixedLength(playerName, Ex3FixedLengthStructureRAF.NAME_LENGTH));

        raf.writeInt(level);
        raf.writeInt(score);
        raf.writeDouble(health);

        raf.close();
    }

    // LOAD RECORD
    public static GameState2 load() throws Exception {
        RandomAccessFile raf = new RandomAccessFile(Ex3FixedLengthStructureRAF.FILE, "r");

        raf.seek(0);

        byte[] nameBytes = new byte[Ex3FixedLengthStructureRAF.NAME_LENGTH];
        raf.readFully(nameBytes);

        String playerName = FixedLengthUtils.fromFixedLength(nameBytes);
        int level = raf.readInt();
        int score = raf.readInt();
        double health = raf.readDouble();

        raf.close();

        return new GameState2(playerName, level, score, health);
    }

    // RANDOM ACCESS UPDATE
    public static void updateHealth(double newHealth) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(Ex3FixedLengthStructureRAF.FILE, "rw");

        raf.seek(Ex3FixedLengthStructureRAF.HEALTH_OFFSET);
        raf.writeDouble(newHealth);

        raf.close();
    }

    public void print() {
        System.out.println("Name  : " + playerName);
        System.out.println("Level : " + level);
        System.out.println("Score : " + score);
        System.out.println("Health: " + health);
    }
}



/// ------------ UTILITY CLASS ------------
class FixedLengthUtils {

    public static byte[] toFixedLength(String s, int length) {
        byte[] result = new byte[length];
        byte[] raw = s.getBytes();

        int copyLength = Math.min(raw.length, length);
        System.arraycopy(raw, 0, result, 0, copyLength);

        return result;
    }

    public static String fromFixedLength(byte[] data) {
        return new String(data).trim();
    }
}