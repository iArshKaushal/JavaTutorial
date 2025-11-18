package org.akk.z1_other_concepts.other.c_supplier;

import java.util.function.Supplier;



public class Ex1SupplierInterface {

    public static void main(String[] args) {

        // Supplier to provide a random double value
        //Supplier<Double> randomValueSupplier = () -> Math.random();
        //System.out.println("Random value: " + randomValueSupplier.get());

        // Supplier to provide a default string
        //Supplier<String> defaultMessageSupplier = () -> "Hello from Supplier!";
        //System.out.println("Default message: " + defaultMessageSupplier.get());

        // Supplier used to provide a value if another value is absent (e.g., in a cache)
        String cachedValue = null;
        String result = getOrDefault(cachedValue, () -> "Default from supplier");
        System.out.println("Result with default: " + result);

        String presentValue = "Existing data";
        String result2 = getOrDefault(presentValue, () -> "Another default");
        System.out.println("Result with present value: " + result2);
    }

    public static <T> T getOrDefault(T value, Supplier<T> defaultSupplier) {
        return (value != null) ? value : defaultSupplier.get();
    }
}