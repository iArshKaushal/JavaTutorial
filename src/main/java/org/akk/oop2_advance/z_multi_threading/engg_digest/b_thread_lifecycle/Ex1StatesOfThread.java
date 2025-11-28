package org.akk.oop2_advance.z_multi_threading.engg_digest.b_thread_lifecycle;

public class Ex1StatesOfThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " is executing it's task after 5 Sec of sleep" );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ex1StatesOfThread t1 = new Ex1StatesOfThread();
        System.out.println(Thread.currentThread().getName() + "-> t1 State: (" + t1.getName() + ") ----> " + t1.getState());

        t1.start();
        System.out.println(Thread.currentThread().getName() + "-> t1 State: (" + t1.getName() + ") ----> " + t1.getState());

        t1.sleep(100);
        System.out.println(Thread.currentThread().getName() + "-> t1 State: (" + t1.getName() + ") ----> " + t1.getState());

        t1.join();
        System.out.println(Thread.currentThread().getName() + "-> t1 State: (" + t1.getName() + ") ----> " + t1.getState());
    }
}
