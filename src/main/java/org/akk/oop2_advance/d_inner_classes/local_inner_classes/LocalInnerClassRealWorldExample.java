package org.akk.oop2_advance.d_inner_classes.local_inner_classes;


/** Local Inner class is created inside the Method, constructor or block */
class OrderProcessor {

    public void processOrder(int orderId){

        // Inner Class
        class Validator{
            public boolean isValid(){
               return orderId > 1;
            }
        }

        Validator validator = new Validator();
        if(validator.isValid()){
            System.out.println("Processing Order Id: " + orderId);
        }else {
            System.out.println("Invalid Order Id.");
        }

    }
}



public class LocalInnerClassRealWorldExample {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(112);
        orderProcessor.processOrder(-1);

    }
}
