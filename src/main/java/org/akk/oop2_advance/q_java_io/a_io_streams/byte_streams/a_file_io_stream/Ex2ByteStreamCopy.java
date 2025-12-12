package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.a_file_io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.akk.zz_utils.FilePaths.ROOT_FILE_PATH;


public class Ex2ByteStreamCopy {
    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("C:/Users/iarsh/OneDrive/Desktop/psnl/dd1.png");
                FileOutputStream fos = new FileOutputStream(ROOT_FILE_PATH + "copied_file.png");
        ) {
            int byteData;
            if(fis != null) {
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }
                fis.close();
                fos.close();
            }
            System.out.println("Image copied successfully!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
