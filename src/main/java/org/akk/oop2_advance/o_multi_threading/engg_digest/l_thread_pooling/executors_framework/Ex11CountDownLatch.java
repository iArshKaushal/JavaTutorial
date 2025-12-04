package org.akk.oop2_advance.o_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.*;



public class Ex11CountDownLatch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int noOfServices = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(noOfServices);
        CountDownLatch latch = new CountDownLatch(noOfServices);
        executorService.submit(new DependentService1(latch));
        executorService.submit(new DependentService1(latch));
        executorService.submit(new DependentService1(latch));

        executorService.submit(new DatabaseService(latch));
        executorService.submit(new CloudStorageServerService(latch));

        // TODO 3:34
        //latch.await();
        latch.await(5,  TimeUnit.SECONDS); // if you want it to wait for specific time period

        System.out.println("All depended services finished, stating Main service...");
        executorService.shutdown();
    }
}


class DependentService1 implements Callable<String> {

    private final CountDownLatch latch;

    DependentService1(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public String call() throws Exception {

        // for a good practice
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + ", Service started...");
        }finally {
            latch.countDown();
        }
        return "OK";
    }
}


class DatabaseService implements Callable<String> {

    private final CountDownLatch latch;

    DatabaseService(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public String call() throws Exception {
        // for a good practice
        try{
            System.out.println(Thread.currentThread().getName() + ", Database Service started...");
            Thread.sleep(5000);
        }finally {
            latch.countDown();
        }
        return "OK";
    }
}

class CloudStorageServerService implements Callable<String> {

    private final CountDownLatch latch;

    CloudStorageServerService(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public String call() throws Exception {
        // for a good practice
        try{
            System.out.println(Thread.currentThread().getName() + ", Cloud Storage Server Service started...");
            Thread.sleep(2000);
        }finally {
            latch.countDown();
        }
        return "OK";
    }
}
