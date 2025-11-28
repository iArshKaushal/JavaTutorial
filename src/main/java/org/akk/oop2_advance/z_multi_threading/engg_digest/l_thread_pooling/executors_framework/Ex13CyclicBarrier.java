package org.akk.oop2_advance.z_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.*;



public class Ex13CyclicBarrier {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int noOfServices = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(noOfServices);

        CyclicBarrier barrier = new CyclicBarrier(noOfServices);
        executorService.submit(new MyDependentService(barrier));
        executorService.submit(new MyDependentService(barrier));
        executorService.submit(new MyDependentService(barrier));
        System.out.println("All depended services finished, starting MAIN_SERVICE...");
        executorService.shutdown();
    }
}


class MyDependentService implements Callable<String> {

    private final CyclicBarrier barrier;

    MyDependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }


    @Override
    public String call() throws Exception {

        System.out.println(Thread.currentThread().getName() + ", Service started...");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ", is waiting at the barrier");
        barrier.await();
        return "OK";
    }
}


