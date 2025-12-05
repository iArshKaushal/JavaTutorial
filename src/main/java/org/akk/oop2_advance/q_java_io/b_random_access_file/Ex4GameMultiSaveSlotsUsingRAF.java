package org.akk.oop2_advance.q_java_io.b_random_access_file;


import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Ex4GameMultiSaveSlotsUsingRAF {

    public static final String FILE = "gamesaves.dat";

    // FIXED SIZE FIELDS
    public static final int NAME_SIZE = 50;       // 50 bytes fixed
    public static final int LEVEL_SIZE = 4;
    public static final int SCORE_SIZE = 4;
    public static final int HEALTH_SIZE = 8;
    public static final int RESERVED_SIZE = 10;   // extra bytes

    public static final int SLOT_SIZE = NAME_SIZE + LEVEL_SIZE + SCORE_SIZE + HEALTH_SIZE + RESERVED_SIZE;

    // Save Game Slot
    public static class GameSlot {
        String name;
        int level;
        int score;
        double health;

        public GameSlot(String name, int level, int score, double health) {
            this.name = name;
            this.level = level;
            this.score = score;
            this.health = health;
        }
    }


    // ----------------------------
    // WRITE A GAME SLOT
    // ----------------------------
    public static void saveSlot(int slotNumber, GameSlot slot) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(FILE, "rw");

        long offset = (long) slotNumber * SLOT_SIZE;
        raf.seek(offset);

        // Write fixed length name
        byte[] nameBytes = slot.name.getBytes(StandardCharsets.UTF_8);
        nameBytes = Arrays.copyOf(nameBytes, NAME_SIZE); // pad to 50 bytes
        raf.write(nameBytes);

        raf.writeInt(slot.level);
        raf.writeInt(slot.score);
        raf.writeDouble(slot.health);

        // padding for future fields
        raf.write(new byte[RESERVED_SIZE]);

        raf.close();
    }


    // ----------------------------
    // READ A GAME SLOT
    // ----------------------------
    public static GameSlot loadSlot(int slotNumber) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(FILE, "r");

        long offset = (long) slotNumber * SLOT_SIZE;
        raf.seek(offset);

        // Read fixed-length name
        byte[] nameBytes = new byte[NAME_SIZE];
        raf.readFully(nameBytes);
        String name = new String(nameBytes, StandardCharsets.UTF_8).trim();

        int level = raf.readInt();
        int score = raf.readInt();
        double health = raf.readDouble();

        raf.close();

        if (name.isEmpty()) {
            return null; // empty slot
        }

        return new GameSlot(name, level, score, health);
    }


    // ----------------------------
    // TEST PROGRAM
    // ----------------------------
    public static void main(String[] args) throws Exception {

        // Create sample save slots
        saveSlot(0, new GameSlot("Ashwani", 10, 3000, 95.5));
        saveSlot(1, new GameSlot("Rahul", 5, 900, 78.2));
        saveSlot(2, new GameSlot("Rohit", 27, 8450, 65.7));

        // Load slots
        System.out.println("=== SLOT 0 ===");
        printSlot(loadSlot(0));

        System.out.println("=== SLOT 1 ===");
        printSlot(loadSlot(1));

        System.out.println("=== SLOT 2 ===");
        printSlot(loadSlot(2));

        System.out.println("=== SLOT 3 (unused) ===");
        printSlot(loadSlot(3));
    }

    public static void printSlot(GameSlot slot) {
        if (slot == null) {
            System.out.println("Empty slot\n");
            return;
        }
        System.out.println("Name  : " + slot.name);
        System.out.println("Level : " + slot.level);
        System.out.println("Score : " + slot.score);
        System.out.println("Health: " + slot.health + "\n");
    }

}
