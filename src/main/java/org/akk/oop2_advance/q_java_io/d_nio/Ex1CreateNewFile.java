package org.akk.oop2_advance.q_java_io.d_nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex1CreateNewFile {

    public static void main(String[] args) {
        ///  Create a file using NIO
        try {

            Path pathLocation = Paths.get("C://Users/iarsh/OneDrive/Desktop/test.txt");
            Path newPath = Files.createFile(pathLocation); 

            FileOutputStream fos = new FileOutputStream(newPath.toFile(), true);

            String fileContent ="This is the file content";
            byte[] bytes = fileContent.getBytes(StandardCharsets.UTF_8);

            fos.write(bytes);
            fos.close();
            System.out.println("New file created at:" +  newPath);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
