package org.akk.oop2_advance.q_java_io.c_file_handling;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex4ReadFileUsingFileInputStream {
    public static void main(String[] args) {

        String path = "C://Users/iarsh/OneDrive/Desktop/test.txt";
        try {
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);

            int byteData;
            if(fis!=null){

                while((byteData = fis.read()) != -1){
                    System.out.print((char)byteData);
                }
                fis.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
