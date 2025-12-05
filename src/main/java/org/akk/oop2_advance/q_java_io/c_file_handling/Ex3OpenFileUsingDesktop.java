package org.akk.oop2_advance.q_java_io.c_file_handling;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ex3OpenFileUsingDesktop {
    public static void main(String[] args) {

        String path = "C://Users/iarsh/OneDrive/Desktop/test.txt";
        try {
            File file = new File(path);
            if(!Desktop.isDesktopSupported()) {
                System.out.println("Desktop is not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();

            if(file.exists()) {
                desktop.open(file);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
