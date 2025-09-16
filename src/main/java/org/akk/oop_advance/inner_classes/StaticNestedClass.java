package org.akk.oop_advance.inner_classes;


class OuterNested {
    private String value = "non static property";
    static String message = "Message from outer Nested example";


    static class Nested {
        void display (){
            System.out.println(message);
        }
    }
}



public class StaticNestedClass {
    public static void main(String[] args) {
        OuterNested.Nested nested = new OuterNested.Nested();
        nested.display();
    }
}









