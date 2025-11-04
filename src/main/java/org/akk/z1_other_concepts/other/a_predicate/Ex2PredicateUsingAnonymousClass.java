package org.akk.z1_other_concepts.other.a_predicate;


import java.util.function.Predicate;

public class Ex2PredicateUsingAnonymousClass {
    public static void main(String[] args) {

        Predicate<String> hasLengthGreaterThan5  = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };

        boolean result = hasLengthGreaterThan5.test("Hello");
        System.out.println(result);

    }
}
