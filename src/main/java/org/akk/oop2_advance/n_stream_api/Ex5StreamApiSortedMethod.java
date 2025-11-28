package org.akk.oop2_advance.n_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class SortedMethodExamples {

    public void sortedIntegersList() {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(5, -10, 7, -18, 23);

        System.out.println("The sorted stream according to provided Comparator is : ");

        // Displaying the list of Strings in
        // reverse order after sorting
        list.stream()
                .sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }

    public void sortedStringListInReverseOrder() {
        // Creating a list of Strings
        List<String> list = Arrays.asList("Geeks", "for", "GeeksforGeeks", "GeeksQuiz", "GFG");

        System.out.println("The sorted stream according to provided Comparator is : ");

        // Displaying the list of Strings in
        // reverse order after sorting
        list.stream()
                .sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }


    public void sortedArrayBasedOnLastCharacter() {
        // Creating an array of Strings
        String[] array = {"GFG", "Geeks", "for", "GeeksforGeeks", "GeeksQuiz"};

        System.out.println("\nThe sorted stream is :");

        // sorting the elements of array based
        // on their last character
        Stream.of(array).sorted((str1, str2) -> Character
                        .compare(
                                str1.charAt(str1.length() - 1),
                                str2.charAt(str2.length() - 1)))
                .forEach(System.out::println);
    }
}


public class Ex5StreamApiSortedMethod {
    public static void main(String[] args) {

        SortedMethodExamples methodExamples = new SortedMethodExamples();
        methodExamples.sortedIntegersList();
        methodExamples.sortedStringListInReverseOrder(); // Reverse order
        methodExamples.sortedArrayBasedOnLastCharacter();

    }
}
