package org.akk.oop2_advance.z_multi_threading.engg_digest.j_thread_safety.b_atomic_classes;

import java.util.concurrent.atomic.AtomicInteger;

/** Description of Code
 * Here we will see what is "Atomicity" and can "volatile" keyword solve it.
 * When we run the code it will not print the accurate result (2000) everytime.
 * */

class AtomicClassCounter {

    private AtomicInteger counter = new AtomicInteger(0);
    String s = "";
    Integer ii = 0;

    public void increment() {
        int i = counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}


public class Ex1AtomicClasses {


    public static void main(String[] args) throws InterruptedException {
        AtomicClassCounter vc = new AtomicClassCounter();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }

        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(vc.getCounter());

    }
}
