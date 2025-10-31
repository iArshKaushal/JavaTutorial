package org.akk.oop2_advance.k_enum;


enum Directions {
    NORTH, SOUTH, EAST, WEST
}


public class Ex5EnumWithSwitch {
    public static void main(String[] args) {
        Directions d = Directions.WEST;

        switch (d) {
            case NORTH -> System.out.println("Going up!");
            case SOUTH -> System.out.println("Going down!");
            case EAST  -> System.out.println("Moving right!");
            case WEST  -> System.out.println("Moving left!");
        }

    }
}
