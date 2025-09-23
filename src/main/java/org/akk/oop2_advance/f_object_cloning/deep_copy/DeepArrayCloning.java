package org.akk.oop2_advance.f_object_cloning.deep_copy;


import java.sql.Array;

class EmpAddress implements Cloneable{
    public String city;

    public EmpAddress(String city) {
        this.city = city;
    }

    @Override
    protected EmpAddress clone()  {
        try {
            return (EmpAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class DeepArrayCloning {
    public static void main(String[] args) {

        EmpAddress[] arr1 = {
                new EmpAddress("Chandigarh"),
                new EmpAddress("Patiala"),
                new EmpAddress("Fatehgarh"),
        };


        // Deep Copy
        EmpAddress[] arr2 = new EmpAddress[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i].clone();
        }

        arr2[0].city = "Mumbai";
        System.out.println("arr1[0] : " +  arr1[0].city);
        System.out.println("arr2[0] : " +  arr2[0].city);

    }
}
