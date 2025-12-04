package org.akk.oop2_advance.o_multi_threading.engg_digest.g_locking.d_read_write_locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Ex1ReadWriteCounterWithLock {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    private int count = 0;

    public void increment() {
        writeLock.lock();
        try {
            count++;
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ex1ReadWriteCounterWithLock counter = new Ex1ReadWriteCounterWithLock();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented");
                }

            }
        };



        Thread writeThread = new Thread(writeTask, "Write Thread");
        Thread readThread1 = new Thread(readTask, "Read Thread - 1");
        Thread readThread2 = new Thread(readTask, "Read Thread - 2");

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();


    }
}
