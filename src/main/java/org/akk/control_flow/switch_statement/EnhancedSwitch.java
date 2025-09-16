package org.akk.control_flow.switch_statement;


public class EnhancedSwitch {

    void print(){
        int day = 3;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3, 4, 5 -> "Midweek"; // multiple labels
            default -> "Weekend";
        };
        System.out.println(result); // Midweek
    }

    public static void main(String[] args) {
        System.out.println("Enhanced Switch Example");
        System.out.println("----------------------------");

        EnhancedSwitch enhancedSwitch = new EnhancedSwitch();
        enhancedSwitch.print();
    }
}
