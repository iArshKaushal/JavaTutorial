package org.akk.oop2_advance.r_java_io.a_io_streams.character_stream;

import java.io.*;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


public class Ex3BufferedWriterCharacterStream {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ROOT_FILE_PATH + "demo2.txt"));
            BufferedReader br = new BufferedReader(new FileReader(ROOT_FILE_PATH + "demo1.txt"));
            String line;

            if(bw != null && br != null){
                bw.write("Hello World");
                bw.newLine();
                while((line = br.readLine()) != null){
                    bw.write(line);
                    bw.newLine();
                }

                br.close();
                bw.close();
            }
            System.out.println("Text is written from file 1 to file 2 successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
