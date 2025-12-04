package org.akk.oop2_advance.o_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex10ProblemWithExecuteService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<?> future1 = executorService.submit(new DependentService());
        Future<?> future2 = executorService.submit(new DependentService());
        Future<?> future3 = executorService.submit(new DependentService());

        future1.get();
        future2.get();
        future3.get();

        System.out.println("All depended services finished, stating main service...");
        executorService.shutdown();
    }
}

class DependentService implements Runnable{
    @Override
    public void run() {
        System.out.println("DependentService run");
    }
}


