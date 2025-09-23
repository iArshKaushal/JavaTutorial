package org.akk.oop2_advance.f_object_cloning.shallow_copy;


import java.util.Arrays;

public class ShallowArrayCloningEx1 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};

        int[] arr2 = arr.clone();

        arr2[0] = 10;

        System.out.println("Before clone: " + Arrays.toString(arr));
        System.out.println("After clone: " + Arrays.toString(arr2));

    }
}
