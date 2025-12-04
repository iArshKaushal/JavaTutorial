package org.akk.oop2_advance.o_multi_threading.interfaces_in_threading.b_callable_interface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



class MyCallable implements Callable<Integer> {
    private int number;

    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        // Simulate a time-consuming computation
        Thread.sleep(1000);
        return number * number;
    }
}

public class Ex1CallableInterface {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        MyCallable task1 = new MyCallable(5);
        MyCallable task2 = new MyCallable(10);

        Future<Integer> future1 = executor.submit(task1);
        Future<Integer> future2 = executor.submit(task2);

        System.out.println("Result of task 1: " + future1.get()); // Blocks until result is available
        System.out.println("Result of task 2: " + future2.get());

        executor.shutdown();
    }
}

