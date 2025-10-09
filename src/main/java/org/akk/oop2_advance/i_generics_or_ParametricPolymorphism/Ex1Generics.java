package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism;

import java.util.ArrayList;
import java.util.List;



public class Ex1Generics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        //list.add(123); // ❌ Compile-time error

        String s = list.get(0); // ✅ No casting needed

    }
}
