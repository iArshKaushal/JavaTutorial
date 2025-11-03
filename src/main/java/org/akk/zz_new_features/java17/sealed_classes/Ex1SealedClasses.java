package org.akk.zz_new_features.java17.sealed_classes;

/// SEALED CLASS
sealed class Processor permits Laptop, DesktopComputer, Mobile {}

///  FINAL_CLASS
final class Laptop extends Processor{}

///  FINAL_CLASS
final class DesktopComputer extends Processor{}

///  NON_SEALED_CLASS
non-sealed class Mobile extends Processor{

    public void openRearCamera(){
        System.out.println("Opening Rear Camera");
    }
    public void openFrontCamera(){
        System.out.println("Opening Front Camera");
    }
}

///  NORMAL_CLASS
class RearCamera extends Mobile{
    public void openRearCamera(){
        Mobile mobile = new Mobile();
        mobile.openRearCamera();
    }
}

class Keyboard {}



public class Ex1SealedClasses {
    public static void main(String[] args) {
        RearCamera rearCamera = new RearCamera();
        rearCamera.openRearCamera();
    }
}
