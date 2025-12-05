package org.akk.oop2_advance.q_java_io.a_io_streams.character_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;

public class Ex1FileReaderCharacterStream {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader(ROOT_FILE_PATH + "demo1.txt");
            int ch;

            if(fr != null){
                while((ch = fr.read()) != -1){
                    System.out.print((char)ch);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
