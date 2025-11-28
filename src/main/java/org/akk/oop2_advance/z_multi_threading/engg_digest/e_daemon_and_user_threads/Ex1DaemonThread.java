package org.akk.oop2_advance.z_multi_threading.engg_digest.e_daemon_and_user_threads;

public class Ex1DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        Ex1DaemonThread daemonThread = new Ex1DaemonThread();
        daemonThread.setDaemon(true); // Set as daemon thread
        daemonThread.start();

        System.out.println("Main (user) thread is running...");
        try {
            Thread.sleep(3000); // Main thread performs some work
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main (user) thread is ending.");
        // When the main thread ends, the JVM will exit and the daemon thread will be terminated.
    }
}
