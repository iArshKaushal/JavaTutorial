package org.akk.oop2_advance.o_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Ex15CompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker Thread CF - 1");
            } catch (InterruptedException e) {

            }
            return "CF-1 Return";
        });

        /// completableFuture is a damon thread so, main thread will not wait for it, to complete.
        /// if you want to make main thread wait then you can use the get(), shown as below
        //cf1.getNow("This will be returned when above code doesn't executed");
        //String s = cf1.get();
        //System.out.println(s);


        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker Thread CF-2");
            } catch (InterruptedException e) {

            }
            return "CF-2 Return";
        });

        CompletableFuture<Void> future = CompletableFuture.allOf(cf1, cf2);
        future.get();
        future.join();


        System.out.println("MAIN_THREAD_ID: " + Thread.currentThread().getId());

    }
}
