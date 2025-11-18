package org.akk.zz_new_features.java8.e_method_reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;



public class Ex4InstanceMethodReferenceClassArbitraryObject {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "apple", "Cherry");
        Collections.sort(list, String::compareToIgnoreCase);

        /// above line is similar to this following line of code
        // Collections.sort(list, (String a, String b)-> a.compareToIgnoreCase(b));

        System.out.println(list);

    }
}
