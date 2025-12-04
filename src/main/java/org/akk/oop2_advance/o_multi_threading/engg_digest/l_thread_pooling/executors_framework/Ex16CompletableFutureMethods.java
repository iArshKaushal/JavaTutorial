package org.akk.oop2_advance.o_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Ex16CompletableFutureMethods {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker Thread");
            } catch (InterruptedException e) {

            }
            return "CF";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally( s ->"Timeout occurred");

        String s = cf1.get();
        System.out.println(s);


        System.out.println("MAIN_THREAD_ID: " + Thread.currentThread().getId());

    }
}
