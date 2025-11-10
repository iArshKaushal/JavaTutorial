package org.akk.zz_new_features.java8.e_method_reference;

import java.util.function.Function;


class StaticMethodReference{
    public static int square(int number) {
        return number * number;
    }
}

public class Ex1MethodReference {


    public static void main(String[] args) {

        /// Using lambda expression
        Function<Integer, Integer> lambdaSquare = num -> StaticMethodReference.square(num);
        System.out.println("Lambda result: " + lambdaSquare.apply(5));

        /// Using method reference
        Function<Integer, Integer> methodRefSquare = StaticMethodReference::square;
        System.out.println("Method reference result: " + methodRefSquare.apply(5));
    }
}
