package org.akk.oop2_advance.q_java_io.b_random_access_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


public class Ex1RandomAccessFile {
    public static void main(String[] args) {

        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(ROOT_FILE_PATH + "player.dat", "rw");
            // Write
            raf.writeUTF("Ashwani");
            raf.writeInt(135);   // level
            raf.writeInt(35445); // score
            raf.writeDouble(85.5); // health
            raf.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
