package org.akk.oop2_advance.n_stream_api;

import java.util.List;
import java.util.stream.Stream;


/// Stream Lazy Evaluation
/// ================================
/// Streams execute operations only when a terminal operation is invoked. Check coding example for more
///
public class ExStreamApiLazyEvaluation {
    public static void main(String[] args) {

        List<String> list = List.of("Ashwani", "Arjun", "Rahul", "Anuj");

        Stream<String> s = list.stream().filter(x -> {
            System.out.println("Filtering: " + x);
            return x.startsWith("A");
        });
        System.out.println("Before terminal operation...");
        long count = s.count(); // <---------- Only now filtering happens
        System.out.println("After terminal operation...(Total Count of words what starts with 'A': " + count + ")");

    }
}
