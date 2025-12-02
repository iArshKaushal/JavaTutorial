package org.akk.oop1_basic.i_strings;



public class Ex3StringBufferThreadSafe {
    public static void main(String[] args) throws InterruptedException {

        StringBuffer sb = new StringBuffer();

        StringBufferTask task1 = new StringBufferTask(sb);
        StringBufferTask task2 = new StringBufferTask(sb);

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        /// Here it is not giving us the accurate result of 2000, because it is not "Thread-Safe"
        System.out.println("Final Length: " + sb.length());
    }
}


class StringBufferTask extends Thread{

    StringBuffer sb;

    public StringBufferTask(StringBuffer sb) {
        this.sb = sb;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            sb.append("a");
        }
    }
}