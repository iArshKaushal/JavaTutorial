package org.akk.oop2_advance.o_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Ex5InvokeAllMethod {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        /// ==================================================
        /// Example - 1
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable1 = ()-> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };

        Callable<Integer> callable2 = ()-> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };

        Callable<Integer> callable3 = ()-> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };


        List<Callable<Integer>> callables = Arrays.asList(callable1, callable2, callable3);
        List<Future<Integer>> futures = executorService.invokeAll(callables);

        for(Future<Integer> f : futures){
            System.out.println(f.get());
        }
        executorService.shutdown();
        System.out.println("After invokeAll() executed");




        /// =======================================================
        /// Example - 2

        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        List<Future<Integer>> futures1 = executorService1.invokeAll(callables, 1, TimeUnit.SECONDS);
        executorService1.shutdown();
        System.out.println("invokeAll() - with timeout - executed");
    }
}
