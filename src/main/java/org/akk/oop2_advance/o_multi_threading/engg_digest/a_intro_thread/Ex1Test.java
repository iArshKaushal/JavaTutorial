package org.akk.oop2_advance.o_multi_threading.engg_digest.a_intro_thread;

public class Ex1Test {
    public static void main(String[] args) {

        World world = new World();
        world.start();

        for(int i=0; i<1000; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
