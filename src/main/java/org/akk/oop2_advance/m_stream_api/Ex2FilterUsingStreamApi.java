package org.akk.oop2_advance.m_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2FilterUsingStreamApi {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(15);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        List<Integer> evenList = list.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Primary List: " + list);
        System.out.println("Filtered Even Numbers: " + evenList);
    }
}
