package org.akk.z1_other_concepts.other.e_function_interface;

import java.util.function.Function;

public class Ex1FunctionInterface {

    public static void main(String[] args) {
        // Define a Function to convert a String to its length (Integer)
        Function<String, Integer> stringLength = s -> s.length();

        // Apply the function
        int length = stringLength.apply("Hello, Java!");
        System.out.println("Length of the string: " + length); // Output: 12

        // Define a Function to convert an Integer to its square (Integer)
        Function<Integer, Integer> square = x -> x * x;

        // Apply the function
        int result = square.apply(5);
        System.out.println("Square of 5: " + result); // Output: 25
    }
}
