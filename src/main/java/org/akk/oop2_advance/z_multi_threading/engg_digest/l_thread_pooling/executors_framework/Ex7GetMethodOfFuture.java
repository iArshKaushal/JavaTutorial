package org.akk.oop2_advance.z_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.*;

public class Ex7GetMethodOfFuture {

    public static void getMethodExample() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        /// get()
        Future<Integer> future = executorService.submit(() -> 42);
        System.out.println(future.get());
        executorService.shutdown();
    }

    public static void getMethodWithTimeExample() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        /// get(time)
        Future<Integer> future2 = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred: " + e);
            }
            return 54;
        });

        try {
            Integer i = future2.get(1, TimeUnit.SECONDS);
            System.out.println(future2.isDone());
            System.out.println(i);
        } catch (TimeoutException | RuntimeException e) {
            System.out.println("Exception occurred: " + e);
        }
        executorService.shutdown();
    }

    public static void cancelExample() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future3 = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred: " + e);
            }
            System.out.println("Hello World");
            return 66;
        });

        // following block is used to display that "hello world" text
        // because we are canceling, while task may or may not be completed before canceling
        // that's why we are just taking a time of 1 sec and letting the task completed
        try {
            Thread.sleep(1000);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred: " + e);
        }

        future3.cancel(false);
        System.out.println(future3.isCancelled());
        System.out.println(future3.isDone());
        executorService.shutdown();

    }



    public static void main(String[] args) throws InterruptedException, ExecutionException {


        /// Example 1 - get()
        Ex7GetMethodOfFuture.getMethodExample();

        /// Example 2 - get(time)
        Ex7GetMethodOfFuture.getMethodWithTimeExample();

        /// Example 3 - cancel()
        Ex7GetMethodOfFuture.cancelExample();





    }
}
