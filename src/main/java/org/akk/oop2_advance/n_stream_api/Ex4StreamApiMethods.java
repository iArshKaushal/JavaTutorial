package org.akk.oop2_advance.n_stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4StreamApiMethods {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(14);
        list.add(15);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        System.out.println(list);

        ///  Filter and Map together
        list.stream()
                .filter(e->e%2==0)
                .map(e->e*e)
                .forEach(System.out::println);


        ///  Sorted
        list.stream().sorted().forEach(System.out::println);


        ///  Sorted and Reversed Order
        list.stream().sorted(Comparator.reverseOrder()).forEach((e)->{
            System.out.println("Sorted in Reverse Order:--- " + e);
        });


        /// Min
        List<Integer> minimum = list.stream().min((x, y) -> x.compareTo(y)).stream().collect(Collectors.toList());
        System.out.println("Minimum number: " + minimum);

        System.out.println("MIN Function O/P:");
        list.stream().min(Integer::compareTo).ifPresent(System.out::println);

        /// Max
        List<Integer> maximum = list.stream().max((x, y) -> x.compareTo(y)).stream().collect(Collectors.toList());
        System.out.println("Maximum number: " + maximum);




    }
}
