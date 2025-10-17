package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism;

import java.util.ArrayList;
import java.util.List;

class MathOperations{
    List<Number> numbers = new  ArrayList<>();

    public void add(List<? super Number> input){

        for(Object i: input){

        }

    }

}


public class Ex6BoundedTypeParameterLowerBound {
    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();

        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        mathOperations.add(list);

    }
}
