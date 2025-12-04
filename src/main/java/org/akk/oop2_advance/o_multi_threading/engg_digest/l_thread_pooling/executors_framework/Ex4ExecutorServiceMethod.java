package org.akk.oop2_advance.o_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.*;

public class Ex4ExecutorServiceMethod {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ///  Example 1
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(() -> 1 + 2);
        System.out.println(future.get());

        executorService.shutdown();
        System.out.println("isShutdown: " + executorService.isShutdown());
        System.out.println("Please wait for 2 sec for termination...");

        Thread.sleep(2000);
        System.out.println("isTerminated: " + executorService.isTerminated());



    }
}
