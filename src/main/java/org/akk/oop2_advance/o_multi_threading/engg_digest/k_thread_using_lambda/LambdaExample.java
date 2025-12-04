package org.akk.oop2_advance.o_multi_threading.engg_digest.k_thread_using_lambda;


@FunctionalInterface
interface MyFuncInterface{
    void print(String message);
}

public class LambdaExample {
    public static void main(String[] args) {


        // Lambda
        MyFuncInterface funcInterface = (message)-> {
            System.out.println("Message from Lambda: " + message);
        };
        funcInterface.print("Hello World");

    }


}
