package org.akk.oop1_basic.d_abstraction.interface_example;


interface MathUtils {
    static int square(int n) {
        return n * n;
    }
}


public class InterfaceStaticMethodExample {
    public static void main(String[] args) {
        int result = MathUtils.square(5);  // ✅ called via interface name
        System.out.println(result);        // 25
    }
}

