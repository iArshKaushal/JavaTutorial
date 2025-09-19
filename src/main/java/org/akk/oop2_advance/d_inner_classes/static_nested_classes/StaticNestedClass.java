package org.akk.oop2_advance.d_inner_classes.static_nested_classes;


class OuterNested {
    private String value = "non static property";
    static String message = "Message from outer Nested example";


    static class Nested {
        void display (){
            System.out.println(message);
        }
    }
}


abstract class aa {}

class bb{
    aa aa = new aa(){
    };
};


public class StaticNestedClass {
    public static void main(String[] args) {
        OuterNested.Nested nested = new OuterNested.Nested();
        nested.display();
    }
}









