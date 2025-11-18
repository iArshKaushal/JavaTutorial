package org.akk.zz_new_features.java8.e_method_reference;

import java.util.function.Consumer;



class Printer {
    public void printMessage(String message) {
        System.out.println("Message :" + message);
    }
}

/// Ex3 Instance Method Reference Specific Object
public class Ex3InstanceMethodReferenceSpecificObject {
    public static void main(String[] args) {

        ///  Example 1: Instance Method Reference (Specific Object)
        Printer printer = new Printer();
        Consumer<String> ref = printer::printMessage;
        ref.accept("Hello World");


        Consumer<String> ref2 = msg->printer.printMessage(msg);
        ref2.andThen(printer::printMessage).accept("New input is given using andThen()");
        //ref2.accept("Hello World sfdsfsdfsf" );



    }
}
