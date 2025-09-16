package org.akk.control_flow.switch_statement;


public class EnhancedSwitchWithYieldKeyword {

    void print(){
        int day = 4;
        String result = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tues";
            case 3 -> "Wed";
            case 4, 5, 6 -> {
                System.out.println("Processing.....");
                yield "this is mid of the week";
            }
            default -> "Weekend";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        EnhancedSwitchWithYieldKeyword e = new EnhancedSwitchWithYieldKeyword();
        e.print();
    }
}
