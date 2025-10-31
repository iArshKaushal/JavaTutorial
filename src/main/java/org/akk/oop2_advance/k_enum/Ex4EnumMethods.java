package org.akk.oop2_advance.k_enum;



enum Direction {
    NORTH, SOUTH, EAST, WEST
}


public class Ex4EnumMethods {
    public static void main(String[] args) {

        Direction dir = Direction.valueOf("EAST");
        System.out.println(dir.name());     // EAST
        System.out.println(dir.ordinal());  // 2

    }
}
