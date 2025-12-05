package org.akk.oop2_advance.q_java_io;

import java.util.Scanner;

public class Ex1Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();
        System.out.println("Enter the directory:");
        String directory = sc.nextLine();
        System.out.println("Enter the file extension:");
        String fileExtension = sc.nextLine();
        System.out.println("Enter the file size:");
        int fileSize = sc.nextInt();
        System.out.println("Enter the file content:");
        String fileContent = sc.nextLine();

        System.out.printf("File Name, %s, is created with extension %s inside directory %s and the size of the file is %s", fileName, fileExtension, directory, fileSize);

        sc.close();

    }
}
