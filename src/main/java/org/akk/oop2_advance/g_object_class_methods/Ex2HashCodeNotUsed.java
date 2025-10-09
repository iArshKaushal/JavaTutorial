package org.akk.oop2_advance.g_object_class_methods;


import java.util.HashSet;

class Employee1 {
    int id;
    String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee1)) return false;
        Employee1 e = (Employee1) obj;
        return id == e.id && name.equals(e.name);
    }

    /// ❌ hashCode() NOT overridden!
}



public class Ex2HashCodeNotUsed {
    public static void main(String[] args) {

        Employee1 e1 = new Employee1(101, "Ashwani");
        Employee1 e2 = new Employee1(101, "Ashwani");

        HashSet<Employee1> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set.size()); // ❌ 2 — duplicates stored!

    }
}
