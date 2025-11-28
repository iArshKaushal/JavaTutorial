package org.akk.oop2_advance.z_multi_threading.engg_digest.l_thread_pooling.executors_framework;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Ex9ScheduledExecutorService {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = new ScheduledThreadPoolExecutor(1);


        /// Method 1
        scheduler.scheduleAtFixedRate(
                () -> System.out.println("Task executed after evey 5 seconds"),
                5,
                5,
                TimeUnit.SECONDS);


        /// Method 2
        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(
                () -> System.out.println("Task executed after evey 5 seconds"),
                5,
                5,
                TimeUnit.SECONDS);


        /// Method 3
        scheduler.schedule(
                () -> {
                    System.out.println("Initiating shutdown...");
                    scheduler.shutdown();
                },
                20,
                TimeUnit.SECONDS);


        System.out.println((scheduler.isShutdown() ? "Scheduler is shoutdown" : "Scheduler is running"));
    }
}
