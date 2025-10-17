package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism;


class Calculator<T extends Number> {

    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}

public class Ex5BoundedTypeParameterUpperBound {
    public static void main(String[] args) {
        Calculator<Integer> calc = new Calculator<Integer>();
        System.out.println(calc.square(4));

        /// Calculator<String> c2 = new Calculator<>();  // ❌ Error
    }
}
