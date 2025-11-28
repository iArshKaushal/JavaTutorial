package org.akk.oop2_advance.z_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex2UsingExecutorsFramework {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // [NOT_REQUIRED] ---> Thread[] threads = new Thread[9];
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i < 10; i++) {
            int finalI = i;

            executorService.submit(() -> {
                long result = factorial(finalI);
                System.out.println("Result: " + result);
            });

            // [NOT_REQUIRED] --->
            /*threads[i-1] = new Thread(() -> {
                long result = factorial(finalI);
                System.out.println("Result: " + result);

            });
            threads[i - 1].start();*/
        }
        executorService.shutdown();

        // [NOT_REQUIRED] --->
        // Waiting for all the thread to complete
        /*for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }*/

        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
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
