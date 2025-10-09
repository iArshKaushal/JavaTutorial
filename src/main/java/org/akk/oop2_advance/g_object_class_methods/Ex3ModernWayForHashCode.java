package org.akk.oop2_advance.g_object_class_methods;

import java.util.HashSet;
import java.util.Objects;


class Employee2{
    private int id;
    private String name;

    Employee2(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Employee2)) return false;

        Employee2 e = (Employee2) obj;
        return id == e.id && name.equals(e.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Ex3ModernWayForHashCode {
    public static void main(String[] args) {
        Employee2 e2 = new Employee2(101, "Ashwani");
        Employee2 e3 = new Employee2(101, "Ashwani");

        HashSet<Employee2> set = new HashSet<>();
        set.add(e2);
        set.add(e3);

        System.out.println(set.size());

    }
}
