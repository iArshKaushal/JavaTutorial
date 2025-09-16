package org.akk.control_flow.switch_statement;




public class TraditionalSwitchExample {

    void print(){

        int day = 3;
        String result;

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
            case 4:
            case 5:
                result = "Midweek";
                break;
            default:
                result = "Weekend";
        }
        System.out.println(result); // Midweek
    }


    public static void main(String[] args) {
        System.out.println("Traditional Switch Example");
        System.out.println("----------------------------");

        TraditionalSwitchExample traditionalSwitch = new TraditionalSwitchExample();
        traditionalSwitch.print();
    }
}
