package org.akk.zz_new_features.java8.e_method_reference;

import java.util.function.Function;

/// Q: How to use "method reference" with your own custom class ?
///
/// Example 2 – Using Function to return custom object
/// ====================================================
///
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Custom Method
    Employee promote(){
        return new Employee(name + " (Senior Project Engineer): ", salary);
    }
}



public class Ex5MethodReferenceWithCustomClass {
    public static void main(String[] args) {

        /// Function reference:
        Function<Employee, Employee> promoteFunc = Employee::promote;

        Employee e1 = new Employee("Ashwani", 82000);
        Employee empPromoted = promoteFunc.apply(e1);
        System.out.println("Promoted employee name: " + empPromoted.name + " With salary: " + empPromoted.salary + "/-");

    }
}
