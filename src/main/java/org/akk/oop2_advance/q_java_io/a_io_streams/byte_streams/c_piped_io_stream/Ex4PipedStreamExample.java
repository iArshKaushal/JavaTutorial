package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams.c_piped_io_stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


/**
 * PipedInputStream:
 * ------------------
 * is a special type of byte input stream used for Inter-Thread Communication (ITC) in Java.
 * It allows one thread to write bytes and another thread to read those bytes, like a pipe between threads.
 *      => Writer Thread → PipedOutputStream === pipe ===> PipedInputStream → Reader Thread
 * Data flows directly through memory, not through a file or network.
 *
 * */

public class Ex4PipedStreamExample {

    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Writing: " + i);
                    pos.write(i);
                    Thread.sleep(500);
                }
                pos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread readerThread = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.println("Reading: " + data);
                }
                pis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        writerThread.start();
        readerThread.start();
    }
}
