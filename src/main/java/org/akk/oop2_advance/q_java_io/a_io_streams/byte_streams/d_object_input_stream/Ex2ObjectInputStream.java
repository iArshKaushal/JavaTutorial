package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.d_object_input_stream;

import java.io.*;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;

public class Ex2ObjectInputStream {

    public static void main(String[] args) {
        readPlayerData();
    }


    public static void readPlayerData(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(ROOT_FILE_PATH + "game.dat"));
            Player p = (Player) ois.readObject();
            System.out.println(p.name + " " + p.level + " " + p.health + " " );

            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }


}




