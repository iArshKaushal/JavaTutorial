package org.akk.oop2_advance.z_multi_threading.engg_digest.j_thread_safety.a_volatile;

/**
 * Volatile Keyword
 * Problem: - Now problem here is that if we are not using the keyword "volatile" and runs the code then reader thread will be stuck at the while loop
 * because ---> every that store the variables in their own cache memory, even if you updated the value of FLAG in the main memory
 * it will not get the updated value
 * To avoid the threads to store the values of the variables in their cache use "volatile" keyword
 * */

class SharedResource {

    public volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("WRITER_THREAD : made the flag TRUE");
        flag = true;
    }

    public void printIfFlagTrue() {
        while(!flag) {
            //System.out.println("WRITER_THREAD is running the loop");
            // do nothing
        }
        System.out.println("Flag True");
    }

}

public class Ex1Volatile {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        // Reader
        Thread writerThread = new Thread(() -> {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            sr.setFlagTrue();
        });

        // Writer
        Thread readerThread = new Thread(() -> sr.printIfFlagTrue());

        writerThread.start();
        readerThread.start();

    }
}
