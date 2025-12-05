package org.akk.oop2_advance.q_java_io.a_io_streams.character_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


public class Ex2BufferedReaderCharacterStream {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(ROOT_FILE_PATH + "demo1.txt"));
            String line;

            if (br != null) {
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
