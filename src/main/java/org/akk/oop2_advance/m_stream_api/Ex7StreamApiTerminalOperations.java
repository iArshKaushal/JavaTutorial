package org.akk.oop2_advance.m_stream_api;


import java.util.List;
import java.util.stream.Collectors;

public class Ex7StreamApiTerminalOperations {
    public static void main(String[] args) {

        List<String> list1 = List.of("Ashwani", "Ravi", "Heena", "Vibha");

        ///  forEach(Consumer<T>)
        list1.stream().forEach(System.out::println);

        /// collect(Collector<T, A, R>)
        list1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        /// toList(), toSet(), toMap()   -----> (From Java 16 onward)
        list1.stream().toList()
                .forEach(System.out::println);

        /// reduce()

        ///

    }
}
