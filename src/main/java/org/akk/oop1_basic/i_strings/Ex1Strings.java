package org.akk.oop1_basic.i_strings;

public class Ex1Strings {
    public static void main(String[] args) {

        String x = "Ashwani";

        String a = new String (x);
        String b = new String ("Ashwani");
        String c = new String ("Ashwani");

        String d = "Ashwani";
        String e = "Ashwani";

        System.out.println("Address of x: " + System.identityHashCode(x));
        System.out.println("Address of a: " + System.identityHashCode(a));
        System.out.println("Address of b: " + System.identityHashCode(b));
        System.out.println("Address of c: " + System.identityHashCode(c));
        System.out.println("Address of d: " + System.identityHashCode(d));
        System.out.println("Address of e: " + System.identityHashCode(e));

        System.out.println(a == b);
        System.out.println(d == e);
    }
}
