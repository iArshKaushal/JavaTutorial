package org.akk.oop2_advance.n_stream_api;


import java.util.ArrayList;
import java.util.List;

public class Ex1BeforeStreamApi {
    public static void main(String[] args) {


        ///  Creating a new list
        List<Integer> list1 = List.of(2, 3, 4, 5, 8, 12, 15, 16, 17);

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(22);


        ///  Approach 1 -
        ///  Creating a new list from old list that only have even numbers
        List<Integer> evenList = new ArrayList<>();
        for(Integer i : list1){
            if(i%2 == 0){
                evenList.add(i);
            }
        }
        System.out.println("Filtered List (Using traditional approach): " + evenList);

    }
}
