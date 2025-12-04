package org.akk.oop2_advance.o_multi_threading.engg_digest.l_thread_pooling.executors_framework;

public class Ex1WithoutExecutorsFramework {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];

        for (int i = 1; i < 10; i++) {
            int finalI = i;
            threads[i-1] = new Thread(() -> {
                long result = factorial(finalI);
                System.out.println("Result: " + result);

            });
            threads[i - 1].start();
        }

        // Waiting for all the thread to complete
        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total execution time: " + (System.currentTimeMillis() - startTime));
    }


    public static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
