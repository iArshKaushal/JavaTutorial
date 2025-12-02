package org.akk.oop1_basic.i_strings;

public class Ex4StringPerformanceCalculator {
    public static void main(String[] args) {

        long startTime, endTime;

        /// Using String
        startTime = System.currentTimeMillis();
        String str = "Java";
        for (int i = 0; i < 100000; i++) {
            str += " Programming";
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken (STRING): " + (endTime - startTime) + "ms");



        /// Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
           sb.append(" Programming");
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken (StringBuilder): " + (endTime - startTime) + "ms");



        /// Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sbf.append(" Programming");
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken (StringBuffer): " + (endTime - startTime) + "ms");

    }
}
