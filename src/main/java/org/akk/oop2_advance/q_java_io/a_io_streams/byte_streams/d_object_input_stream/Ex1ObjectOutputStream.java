package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.d_object_input_stream;

import java.io.*;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;

public class Ex1ObjectOutputStream {

    public static void main(String[] args) {
        writePlayerData();
    }

    public static void writePlayerData(){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(ROOT_FILE_PATH + "game.dat"));
            oos.writeObject(new Player("Ashwani", 10, 95.5, ""));
            System.out.println("Player data written successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}




