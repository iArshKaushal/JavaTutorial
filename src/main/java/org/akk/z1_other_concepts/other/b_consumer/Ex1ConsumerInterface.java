package org.akk.z1_other_concepts.other.b_consumer;

import java.util.function.Consumer;

public class Ex1ConsumerInterface {
    public static void main(String[] args) {
        // Consumer to print a String
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello, Consumer!");

        // Consumer to double an Integer and print it
        Consumer<Integer> doubler = i -> System.out.println(i * 2);
        doubler.accept(5);

        // Chaining Consumers
        Consumer<String> upperCasePrinter = s -> System.out.println(s.toUpperCase());
        Consumer<String> combinedConsumer = printer.andThen(upperCasePrinter);
        combinedConsumer.accept("chained consumers");
    }
}
