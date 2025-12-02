package org.akk.oop1_basic.i_strings;


public class Ex2StringBuilder {

    public static void main(String[] args) {

        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        sb.append(" Ashwani,");
        int len = sb.length();
        sb.insert(len, " Welcome to our Application");
        System.out.println(sb);


        /// DELETE
        System.out.println("DELETE: " + sb.deleteCharAt(sb.length() - 1));

        /// REVERSED
        System.out.println("REVERED: " + sb.reverse());

    }
}
