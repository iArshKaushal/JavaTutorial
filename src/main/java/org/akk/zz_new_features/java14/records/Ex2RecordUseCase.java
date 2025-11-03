package org.akk.zz_new_features.java14.records;

record Employee(int id, String name, double salary) implements Comparable<Employee>{

    // You can add static fields/methods
    public static final String COMPANY_NAME = "ByteBloom";

    // You can define extra methods
    public double yearlySalary(){
        return salary * 12;
    }


    @Override
    public int compareTo(Employee employee) {
        return this.name.compareTo(employee.name);
    }

    // You can define compact constructors for validation
    public Employee{
        if(salary < 0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }
}



public class Ex2RecordUseCase {
    public static void main(String[] args) {
        Employee employee = new Employee(1001, "Ashwani", 500000);
        System.out.println(employee.name());            // Accessor
        System.out.println(employee.yearlySalary());    // Custom method
        System.out.println(employee);                   // Prints: Employee[id=E101, name=Ashwani, salary=50000.0]
    }
}
