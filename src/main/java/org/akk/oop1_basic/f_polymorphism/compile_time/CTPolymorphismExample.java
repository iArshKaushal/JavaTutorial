package org.akk.oop1_basic.f_polymorphism.compile_time;

/** Compile Time Polymorphism
 * using method overloading
 * */


class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CTPolymorphismExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));       // 30 (int version)
        System.out.println(calc.add(2.5, 3.5));     // 6.0 (double version)
        System.out.println(calc.add(1, 2, 3));      // 6 (3 args version)
    }
}

