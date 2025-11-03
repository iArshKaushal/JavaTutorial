package org.akk.zz_new_features.java17.sealed_classes;

///  SEALED_INTERFACE
sealed interface X permits Y, Z{
    void print();

    static void test(){
        System.out.println("Interface X: test method");
    }
}


///  SEALED_INTERFACE
sealed interface Y extends X {
    void display();
}



///  NON_SEALED_INTERFACE
non-sealed interface Z extends X {}



final class SealedInterface implements Y {

    @Override
    public void print() {

    }

    @Override
    public void display() {

    }
}


public class Ex2SealedInterfaces {
    public static void main(String[] args) {

    }
}
