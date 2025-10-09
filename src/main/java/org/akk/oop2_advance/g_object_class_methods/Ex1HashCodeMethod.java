package org.akk.oop2_advance.g_object_class_methods;

import java.util.HashSet;


class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return id == e.id && name.equals(e.name);
    }

    @Override
    public int hashCode() {
        return id; // simple hash based on ID
    }
}



public class Ex1HashCodeMethod {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ashwani");
        Employee e2 = new Employee(101, "Ashwani");

        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println("EMP 1 : "  + e1);
        System.out.println("EMP 2 : "  + e2);
        System.out.println(set.size()); // ✅ 1 — duplicates detected correctly

    }
}
