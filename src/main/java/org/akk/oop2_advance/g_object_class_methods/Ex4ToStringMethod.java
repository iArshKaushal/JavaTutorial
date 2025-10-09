package org.akk.oop2_advance.g_object_class_methods;

class Employee3 {
    int id;
    String name;

    Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee3 {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class Ex4ToStringMethod {
    public static void main(String[] args) {
        Employee3  emp = new Employee3(1001, "Ashwani");
        System.out.println(emp);

        // Object representation using toString()
        Object o = new Object();
        System.out.println(o.toString());
    }
}
