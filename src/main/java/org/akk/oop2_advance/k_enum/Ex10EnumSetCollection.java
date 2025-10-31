package org.akk.oop2_advance.k_enum;

import java.util.*;

enum Student {
    Geek1, Geek2, Geek3, Geek4, Geek5, Geek6, Geek7;
}

enum Teacher {
    Faculty1, Faculty2, Faculty3, Faculty4, Faculty5;
}

// Creating an enum of GFG type
enum GFG {
    Welcome, To, The, World, of, Geeks
}
;

public class Ex10EnumSetCollection {
    public static void main(String[] args) {

        ///  Example - EnumSet.of(E e)
        EnumSet<Student> students = EnumSet.of(Student.Geek1, Student.Geek2, Student.Geek2); // Valid
        //EnumSet<Student> students = EnumSet.of(Student.Geek1, Student.Geet2, Teacher.Faculty1); /// ERROR

        EnumSet<Teacher> teachers = EnumSet.of(Teacher.Faculty1);


        ///  Example - EnumSet.of(E_first, E_rest)
        // Creating the ist that will be used as args
        GFG[] words = {GFG.Welcome, GFG.World, GFG.Geeks};

        // Creating the set + Adding the first element and the other elements
        EnumSet<GFG> e_set = EnumSet.of(GFG.Welcome, words);

        //Displaying the e_set
        System.out.println("SET : " + e_set);


    }
}
