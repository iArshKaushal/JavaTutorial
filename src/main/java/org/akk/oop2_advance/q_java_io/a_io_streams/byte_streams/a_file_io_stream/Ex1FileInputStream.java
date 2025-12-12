package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.a_file_io_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1FileInputStream {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:/Users/iarsh/OneDrive/Desktop/psnl/dd1.png");
            int byteData;

            if(fis!=null){

                while((byteData = fis.read()) != -1){
                    System.out.print(byteData + " ");
                }
                fis.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
