package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism;



interface Container<T> {
    void add(T Item);
    T get();
}



class MyContainer<T> implements Container<T> {
    public T data;

    @Override
    public void add(T Item) {
        this.data = Item;
    }

    @Override
    public T get() {
        return data;
    }
}


public class Ex8GenericInterfaces {

    public static void main(String[] args) {
        Container<Integer> intContainer = new MyContainer<Integer>();
        intContainer.add(1);
        System.out.println(intContainer.get());

        Container<String> strContainer = new MyContainer<String>();
        strContainer.add("hello");
        System.out.println(strContainer.get());


    }

}
