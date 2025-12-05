package org.akk.oop2_advance.q_java_io.c_file_handling;

import java.io.File;

public class Ex1FilesAndDirectoryHandling {
    public static void main(String[] args) {

        String path = "C://Users/iarsh/OneDrive/Desktop";
        File file = new File(path);

        File[] files = file.listFiles();

        for(File f : files){
            if(f.isFile()){
                System.out.println("File:" + f.getName());
            }else if(f.isDirectory()){
                System.out.println("Directory:" + f.getName());
            }else {
                System.out.println("Unknown File:" + f.getName());
            }
        }

    }
}
