package org.akk.oop2_advance.o_multi_threading.engg_digest.a_intro_thread;

public class World extends Thread{

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.println(Thread.currentThread().getName());
        }

        Other other = new Other();
        other.print();
    }
}




class Other {
    public void print(){
        System.out.println("Other : " + Thread.currentThread().getName());
    }
}