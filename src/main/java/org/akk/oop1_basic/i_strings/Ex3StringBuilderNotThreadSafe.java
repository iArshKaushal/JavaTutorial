package org.akk.oop1_basic.i_strings;



public class Ex3StringBuilderNotThreadSafe {
    public static void main(String[] args) throws InterruptedException {

        StringBuilder sb = new StringBuilder();

        Task task1 = new Task(sb);
        Task task2 = new Task(sb);

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        /// Here it is not giving us the accurate result of 2000, because it is not "Thread-Safe"
        System.out.println("Final Length: " + sb.length());
    }
}


class Task extends Thread{

    StringBuilder sb;

    public Task(StringBuilder sb) {
        this.sb = sb;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            sb.append("a");
        }
    }
}