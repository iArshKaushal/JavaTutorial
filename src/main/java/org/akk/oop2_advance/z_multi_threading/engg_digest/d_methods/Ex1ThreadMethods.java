package org.akk.oop2_advance.z_multi_threading.engg_digest.d_methods;

public class Ex1ThreadMethods extends Thread {

    Ex1ThreadMethods(String name){
        super(name);
    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Ex1ThreadMethods l = new Ex1ThreadMethods("Low Priority Thread");
        Ex1ThreadMethods m = new Ex1ThreadMethods("Medium Priority Thread");
        Ex1ThreadMethods h = new Ex1ThreadMethods("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();

    }
}
