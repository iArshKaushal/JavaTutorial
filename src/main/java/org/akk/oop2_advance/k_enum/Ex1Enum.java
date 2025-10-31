package org.akk.oop2_advance.k_enum;

enum Levels{
    LOW, MEDIUM,HIGH
}


public class Ex1Enum {
    public static void main(String[] args) {

        //
        Levels level = Levels.HIGH;
        System.out.println("Selected Level: " + level);

        /// Iteration
        for(Levels l : Levels.values()){
            System.out.println("Level: " + l);
        }

        ///  Get ordinal (position)
        System.out.println("Order/Position: " + Levels.MEDIUM.ordinal());
        System.out.println("Order/Position: " + Levels.LOW.ordinal());
        System.out.println("Order/Position: " + Levels.HIGH.ordinal());

    }
}
