package org.akk.oop2_advance.q_java_io.c_file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex2CreateNewFile {
    public static void main(String[] args) {

        ///  Create a file using FileOutputStream + Scanner
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the file name:");
            String fileName = sc.nextLine();

            FileOutputStream fos = new FileOutputStream(fileName, true);

            System.out.println("Enter the file content:");
            String fileContent = sc.nextLine();
            byte[] bytes = fileContent.getBytes(StandardCharsets.UTF_8);

            fos.write(bytes);
            fos.close();
            System.out.println("File created");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
