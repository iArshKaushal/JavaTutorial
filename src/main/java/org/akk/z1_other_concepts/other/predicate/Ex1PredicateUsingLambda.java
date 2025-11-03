package org.akk.z1_other_concepts.other.predicate;

import java.util.function.Predicate;


public class Ex1PredicateUsingLambda {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        boolean result = isEven.test(4);

        System.out.println(result);
    }
}
