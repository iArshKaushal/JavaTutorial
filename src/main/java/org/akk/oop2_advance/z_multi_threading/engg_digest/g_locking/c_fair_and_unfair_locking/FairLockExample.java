package org.akk.oop2_advance.z_multi_threading.engg_digest.g_locking.c_fair_and_unfair_locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {

    private final Lock fairLock = new ReentrantLock(true);

    public void accessResource(){
        fairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "acquired the lock.");
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + "released the lock.");
            fairLock.unlock();
        }
    }


    public static void main(String[] args) {
        FairLockExample example = new FairLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread-1 ");
        Thread t2 = new Thread(task, "Thread-2 ");
        Thread t3 = new Thread(task, "Thread-3 ");

        t1.start();
        t2.start();
        t3.start();
    }
}
