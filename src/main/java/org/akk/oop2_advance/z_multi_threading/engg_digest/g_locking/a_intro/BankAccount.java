package org.akk.oop2_advance.z_multi_threading.engg_digest.g_locking.a_intro;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();


    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " Proceeding with Withdrawal");
                        Thread.sleep(3000); // Simulate the time taken to process the transaction
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed Withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + " Failed Withdrawal. insufficient balance");
                }
            }else{
              System.out.println(Thread.currentThread().getName() + " Could not acquire the lock, will try later.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


    }

}
