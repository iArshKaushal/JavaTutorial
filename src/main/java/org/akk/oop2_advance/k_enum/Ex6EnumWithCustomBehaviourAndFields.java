package org.akk.oop2_advance.k_enum;


///  Interface
interface TrafficLightController{
    public void turnOn(String light);
}


/** Enums can also implements INTERFACES
 * */
enum TrafficLights implements TrafficLightController{
    RED("Stop", 30),
    YELLOW("Get Ready", 5),
    GREEN("Go!", 25);

    private String action;
    private int duration;

    TrafficLights(String action,  int duration){
        this.action = action;
        this.duration = duration;
    }

    String getAction(){
        return action;
    }

    int getDuration(){
        return duration;
    }

    @Override
    public void turnOn(String light) {
        System.out.println("Turning on the " + light + " traffic light");
    }
}



public class Ex6EnumWithCustomBehaviourAndFields {
    public static void main(String[] args) {

        for(TrafficLights trafficLights: TrafficLights.values()){
            System.out.println(trafficLights + "\t:\t" + trafficLights.getAction() + " -> "  + trafficLights.getDuration());
        }

        ///  Calling the Interface Method
        TrafficLights.RED.turnOn("RED");

    }
}
