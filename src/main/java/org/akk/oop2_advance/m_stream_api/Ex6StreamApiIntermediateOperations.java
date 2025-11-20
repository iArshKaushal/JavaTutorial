package org.akk.oop2_advance.m_stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Student {

    public static void show(){
        //System.out.println("Show...");
    }

    public void display(){
       // System.out.println("display");
    }
}

public class Ex6StreamApiIntermediateOperations {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list2 = List.of(2, 8, 13, 15, 18, 22, 25, 27, 32);
        List<String> studentList = List.of("Ashwani Kumar", "Ravi Gupta", "Vimal Kumar", "Aabha Sharma");

        /// 1. filter(Predicate<T>)
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        /// 2. map(Function<T, R>)
        System.out.println("=====EXAMPLE_2_MAP=====");
        studentList.stream().map((element)->{
            return  element.toUpperCase();
        }).forEach(System.out::println);

        ///  Same above example using lambda
        studentList.stream().map(String::toLowerCase).forEach(System.out::println);


        /// 3. flatMap(Function<T, Stream<R>>)
        System.out.println("=====EXAMPLE_3_FLAT_MAP=====");
        List<List<Integer>> numbers = List.of(List.of(1, 2, 3, 4), List.of(5, 6, 6, 7, 8));
        numbers.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);



        /// 4. distinct() Removes duplicates.
        System.out.println("===== EXAMPLE_4.1 Distinct (removing duplicates from both list separately) =====");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("===== EXAMPLE_4.2 Distinct (merge two lists then remove duplicates) =====");
        numbers.stream()
                .flatMap(List::stream)
                .distinct()
                .forEach(System.out::println);

        /// 5. sorted(), sorted(Comparator<T>)
        System.out.println("===== EXAMPLE_5.1 - Sorted Method ====");
        list.stream().sorted().forEach(System.out::println);

        System.out.println("===== EXAMPLE_5.2 - Sorted Method ====");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        /// 6. peek(Consumer<T>)     Used for debugging.
        /*list.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .toList();*/


        /// 7. limit(long n) and skip(long n) ==========> Used for pagination or truncation.
        ///  7.1 Skip Method
        System.out.println("===== EXAMPLE_7.1 - Skip() ====");
        list.stream()
                .skip(4)
                .forEach(System.out::println);

        /// 7.2 Limit Method
        System.out.println("===== EXAMPLE_7.2 - Limit() ====");
        list.stream()
                .limit(3)
                .forEach(System.out::println);


        /// 7.3
        System.out.println("===== EXAMPLE_7.3 - Skip() & Limit() ====");
        list.stream()
                .limit(3)
                .skip(2)
                .forEach(System.out::println);


    }
}
