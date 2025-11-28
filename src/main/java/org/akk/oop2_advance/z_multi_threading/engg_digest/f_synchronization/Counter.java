package org.akk.oop2_advance.z_multi_threading.engg_digest.f_synchronization;

public class Counter {
    private int counter = 0;


    /// APPROACH 1
    /*public synchronized void increment() {
        counter++;
    }*/


    ///  APPROACH 2 - This section is known as "CRITICAL-SECTION"
    // if you don't want to make the whole function synchronized,
    // means this function is doing some other things as well which do not need to synchronized
    // then we can use synchronized block and when we are not using "synchronized" keyword that
    // condition is known as "Race-condition". "Race-condition" ko hata ke humne achieve kiya usko bolte hai "Mutual exclusion"
    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }
}
