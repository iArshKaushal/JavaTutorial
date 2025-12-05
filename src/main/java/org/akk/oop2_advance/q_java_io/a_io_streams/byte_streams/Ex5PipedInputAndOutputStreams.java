package org.akk.oop2_advance.q_java_io.a_io_streams.byte_streams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Ex5PipedInputAndOutputStreams {

    public static void main(String[] args) throws IOException {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        // pis.connect(pos); // this line do the same thing as above line do

        Thread writerThread = new Thread(new WriterThread(pos));
        Thread readerThread = new Thread(new ReaderThread(pis));
        Thread readerThread2 = new Thread(new ReaderThread2(pis));

        writerThread.start();
        readerThread.start();
        //readerThread2.start(); // Will not work, because multiple readers can’t read from the same pipe?

        System.out.println("Main Thread Rest of the task.......");
    }
}


class WriterThread implements Runnable {

    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Writing: " + i);
                pos.write(i);
                Thread.sleep(1000);
            }
            pos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class ReaderThread implements Runnable {
    PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        int readData;
        try{
            while((readData = pis.read()) != -1){
                System.out.println(Thread.currentThread().getName() + " - Read: " + readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



///  Another Reader Thread
class ReaderThread2 implements Runnable {
    PipedInputStream pis;

    public ReaderThread2(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        int readData;
        try{
            while((readData = pis.read()) != -1){
                System.out.println(Thread.currentThread().getName() + " - Readx: " + readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


/** 🧠 Full Flow Visualization

 Main Thread:
     Create Pipe
     Start WriterThread
     Start ReaderThread
            ↓
 WriterThread writes a value
            ↓                (Buffered inside pipe)
            ↓────────────► ReaderThread reads value
            ↓
 WriterThread writes next value
            ↓────────────► ReaderThread prints next value
            ↓
 [After all data sent]
 Writer closes stream
            ↓
 Reader receives -1 (EOF)
            ↓
 Reader closes stream


 */