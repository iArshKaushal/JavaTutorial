package org.akk.oop2_advance.o_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.*;

public class Ex12CountDownLatchWithoutExecutor {
    public static void main(String[] args) throws InterruptedException {

        int noOfServices = 3;
        CountDownLatch latch = new CountDownLatch(noOfServices);
        for(int i = 0; i < noOfServices; i++){
            new Thread(new DependentService2(latch)).start();
        }
        latch.await();

        System.out.println("All depended services finished, stating Main service...");

    }
}


class DependentService2 implements Runnable{

    private final CountDownLatch latch;

    DependentService2(CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public void run()  {
        // for a good practice
        try{
            System.out.println(Thread.currentThread().getName() + ", Service started...");
            Thread.sleep(2000);
        }catch (InterruptedException e){

        }finally {
            latch.countDown();
        }
    }

}


