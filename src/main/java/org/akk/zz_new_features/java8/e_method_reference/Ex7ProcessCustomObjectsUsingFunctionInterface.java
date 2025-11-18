package org.akk.zz_new_features.java8.e_method_reference;


import java.util.function.Function;

/// RECORD
record Person1Params(String name, int age, String phone, String email){}



class Person1 {
    String name;
    int age;
    Person1Params person1Params;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person1(Person1Params person1Params) {
        this.person1Params = person1Params;
    }
}


/// MAIN class
public class Ex7ProcessCustomObjectsUsingFunctionInterface {
    public static void main(String[] args) {

        // Syntax for Function interface is Function<T, R> :
        // where T - input and R - Output

        ///  Function 1 - create new Person
        Function<String, Person1> createPerson = name -> new Person1(name, 30);
        /*
            // Equivalent expanded form of :  name -> new Person1(name, 30);
            // =============================================================
            Function<String, Person> createPerson = new Function<String, Person>() {
                @Override
                public Person apply(String name) {
                    return new Person(name, 30);
                }
            };
        */


        ///  Function 2 - extract name of the person
        Function<Person1, String> extractName = person -> person.name;

        ///  Function 3 - convert the name of the person in capital laters
        Function<Person1, String> toCaps = person1 ->  person1.name.toUpperCase();

        ///  Approach 1 - Create New Person
        Person1 person1 = createPerson.apply("Ashwani");
        System.out.println("Person: "+ person1.name + ", Age: "+ person1.age);

        ///  Approach 2 - Create New Person
        String name = createPerson
                .andThen(toCaps)
                .apply("Ashwani");
        System.out.println("Person: "+ name);



        /**
         * NOTE: if you want to pass more than 2 parameters, then we can use various techniques
         *      Approach 1: Create a Custom Functional Interface (Best for 3–4 params)
         *      Approach 2: Use a Builder Pattern (Best for many params or optional params)
         *      Approach 3: Use a Parameter Object (Best for grouping related fields)
        * */

        ///  APPROACH-3
        Function<Person1Params, Person1> createFullPerson = params-> new Person1(params);
        createFullPerson.apply(
                new Person1Params("Aditya", 30, "7845124578", "aditiya@gmail.com")
        );


    }
}
