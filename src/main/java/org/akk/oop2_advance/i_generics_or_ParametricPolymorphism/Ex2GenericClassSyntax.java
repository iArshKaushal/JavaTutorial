package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism;

class Box<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}



public class Ex2GenericClassSyntax {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        intBox.setValue(100);
        System.out.println(intBox.getValue());


        Box<String> stringBox = new Box<String>();
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue());
    }
}
