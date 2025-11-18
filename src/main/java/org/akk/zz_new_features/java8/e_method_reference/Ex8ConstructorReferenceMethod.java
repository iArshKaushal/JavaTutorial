package org.akk.zz_new_features.java8.e_method_reference;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;


class User {
    String name;
    int age;

    User(){
        System.out.println("Constructor-1 (Without Params) User");
    }

    User(String name){
        //this.name = name;
        System.out.println("\nConstructor-2 (1 param) User : " + name);
    }

    User(String name, int age){
        System.out.println("\nConstructor-3 (2 param) User : " + name + " and My age is : " + age);
    }

    public void test(){
        System.out.println("some other method of User class");
    }
}


public class Ex8ConstructorReferenceMethod {
    public static void main(String[] args) {

        /// EX_1: Using Constructor-1
        Supplier<User> supplier = User::new;
        User user = supplier.get(); // calls new Person()
        user.test();

        /// EX_2: Using Constructor-1 - With arguments
        Function<String, User> function = User::new;
        User user2 = function.apply("Hello, from Ashwani");
        user2.test();

        /// EX_3: Constructor Reference with BiFunction (2-Arg Constructor)
        BiFunction<String, Integer, User> biFunction = User::new;
        User user3 = biFunction.apply("Hello, from Ashwani", 36);

        /// EX_4: Constructor Reference with Streams
        List<String> names = List.of("Aman", "Rohit", "Vipul");

        // APPROACH_1
        List<User> users = names.stream()
                .map(User::new)  // calls new Person(name)
                .toList();

        // Approach 2 :
        // we can write code in less lines using APPROACH_1
        /*names.stream().map((name)->{
            return new User(name.toUpperCase());
        }).toList();*/


        /// EX_5: Array Constructor Reference
        IntFunction<int[]> arrayCreator = int[]::new;
        int[] arr = arrayCreator.apply(5);
        System.out.println(arr.length); // 5



    }
}
