package org.akk.oop2_advance.z_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.*;

public class Ex3ReturnWithExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        /// Example 1
        Future<Integer> future = executorService.submit(() -> 43);
        System.out.println(future.get());


        /// Example 2
        Runnable runnable = ()-> System.out.println("Runnable Ex1 ------> When it is not returning anything,then use Runnable");
        Future<?> future2 = executorService.submit(runnable);

        /// Example 3
        Future<String> future3 = executorService.submit(() -> System.out.println("Runnable Ex2 ------> When it is not returning anything,then use Runnable"), "Completed successfully");
        System.out.println(future3.get());

        ///  Example 3
        Callable<String> callable = ()-> "Callable ----> When you want to RETURN something";
        Future<String> future4 = executorService.submit(callable);
        System.out.println(future4.get());

        // this part will run only when future is done, and future will be completed when future.get() method executed
        if(future4.isDone()){
            System.out.println("Future is completed...");
        }

        executorService.shutdown();
    }
}
