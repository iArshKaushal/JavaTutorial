package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism.mine;

public class Ex3GenericMethod {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3};
        String[] words = new String[]{"Hello", "World"};

        Ex3GenericMethod.printArray(numbers);
        Ex3GenericMethod.printArray(words);

    }
}
