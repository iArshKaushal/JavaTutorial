package org.akk.oop2_advance.q_java_io.c_file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class Ex5ReadFileUsingNIOPackage {
    public static void main(String[] args) {

        String path = "C://Users/iarsh/OneDrive/Desktop/test.txt";
        try {
            List<String> linesList = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

            Iterator<String> iterator = linesList.iterator();

            while (iterator.hasNext()) {
                String line = iterator.next();
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
