package org.akk.oop2_advance.k_enum;

enum Operations{

    ///  That curly-braced section after the enum constant is called a
    /// constant-specific class body (or per-constant class body).
    /// and it must implement the abstract method
    TEST{
        @Override
        public double apply(double x, double y) {
            return 0;
        }
    },


    ADD{
        public double apply(double a, double b){
            return a+b;
        }
    },

    SUBTRACT{
        public double apply(double a, double b){
            return a-b;
        }
    },

    MULTIPLE{
        public double apply(double a, double b){
            return a*b;
        }
    },
    DIVIDE{
        public double apply(double a, double b){
            return a+b;
        }
    };

    public abstract double apply(double x, double y);

}

public class Ex3EnumWithMethod {
    public static void main(String[] args) {

       for(Operations op : Operations.values()){
           System.out.println( op + " = " + op.apply(10, 5));
       }

       System.out.println("Single operation : " + Operations.ADD.apply(10, 5));
    }
}
