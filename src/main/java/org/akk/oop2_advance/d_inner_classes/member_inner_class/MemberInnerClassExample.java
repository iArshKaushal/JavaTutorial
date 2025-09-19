package org.akk.oop2_advance.d_inner_classes.member_inner_class;


class Outer {
    private String message = "message from outer";

    class Inner {
        void display (){
            System.out.println(message);
        }
    }
}



public class MemberInnerClassExample {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }

}
