package org.akk.oop2_advance.k_enum;


interface TrafficLightsController {
    void turnOnLight(String light);
}

enum TrafficLight implements TrafficLightsController {
    RED;

    @Override
    public void turnOnLight(String light) {
        System.out.println("Turning on light using " + light);
    }
}

/** Different ways to call interface method in Enum
 * */
public class Ex8EnumWithInterfaces {
    public static void main(String[] args) {

        ///  Approach 1 - Call directly on an enum constant
        TrafficLight.RED.turnOnLight("Direct Call");


        ///  Approach 2 - Call inside a loop
        for(TrafficLight light : TrafficLight.values()){
            light.turnOnLight("inside Loop");
        }

        ///  Approach 3 - Use Interface Reference
        TrafficLightsController trafficLightsController = TrafficLight.RED;
        trafficLightsController.turnOnLight("Using Interface Reference");

    }

}
