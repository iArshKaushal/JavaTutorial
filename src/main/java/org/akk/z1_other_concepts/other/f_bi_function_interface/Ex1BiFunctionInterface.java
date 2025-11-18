package org.akk.z1_other_concepts.other.f_bi_function_interface;

import java.util.function.BiFunction;

public class Ex1BiFunctionInterface {

    public static void main(String[] args) {

        // A BiFunction to add two integers
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
        System.out.println("Sum: " + adder.apply(5, 3)); // Output: Sum: 8

        // A BiFunction to concatenate two strings
        BiFunction<String, String, String> concatenator = (s1, s2) -> s1 + " " + s2;
        System.out.println("Concatenated: " + concatenator.apply("Hello", "World")); // Output: Concatenated: Hello World
    }
}

