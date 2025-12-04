package org.akk.oop2_advance.o_multi_threading.engg_digest.j_thread_safety.a_volatile;

/** Description of Code
 * Here we will see what is "Atomicity" and can "volatile" keyword solve it.
 * No Volatile keyword can not solve it, because,
 * When we run the code it will not print the accurate result (2000) everytime.
 * */

class VolatileCounter {
    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}


public class Ex2AtomicityVolatileCounter {


    public static void main(String[] args) throws InterruptedException {
        VolatileCounter vc = new VolatileCounter();

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
