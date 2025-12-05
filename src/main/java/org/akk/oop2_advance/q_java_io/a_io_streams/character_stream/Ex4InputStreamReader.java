package org.akk.oop2_advance.r_java_io.a_io_streams.character_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4InputStreamReader {

    public static void main(String[] args) {

        // Step-1: Connect to byte input stream (keyboard)
        InputStreamReader isr = new InputStreamReader(System.in);

        // Step-2: Wrap it for efficient reading
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter your name: ");
        String name;

        try {
            if(br != null){
                name = br.readLine(); // read characters
                System.out.println("Hello " + name + "! Welcome to Java IO.");
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
