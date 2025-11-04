package org.akk.oop2_advance.m_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Ex3WaysToGetStreamObject {
    public static void main(String[] args) {

        ///  1. Empty Stream
        Stream<Object> emptyStream = Stream.empty();


        /// 2. Array, Object, Collection using "of()" of stream1 api
        String[] names = {"Ashwani", "Ravi", "Aniket", "Heena"};
        Stream<String> stream1 = Stream.of(names);
        List<String> filteredNames = stream1.filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        /// ERROR : you cannot perform another operation on the same stream
        // stream1.filter(nam->nam.startsWith("H")).collect(Collectors.toList());



        ///  3. Builder pattern
        Stream<Object> streamBuilder = Stream.builder().build();

        /// 4. Arrays
        IntStream intStream = Arrays.stream(new int[]{10, 12, 15, 18, 19, 22});
        intStream.forEach(value-> {
            System.out.println(value);
        });


        /// 5. List, Set, Map
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(15);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        list.stream().forEach(value -> System.out.println(value));


    }
}
