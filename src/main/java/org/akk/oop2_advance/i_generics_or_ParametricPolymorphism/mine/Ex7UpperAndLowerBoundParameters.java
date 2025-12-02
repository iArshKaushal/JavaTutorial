package org.akk.oop2_advance.i_generics_or_ParametricPolymorphism.mine;

import java.util.*;


class Shape {
    void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle drawn");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square drawn");
    }
}


public class Ex7UpperAndLowerBoundParameters {

    /// upper bound: accepts Shape or its subclasses
    static void drawShapes(List<? extends Shape> list) {
        for (Shape s : list)
            s.draw();
    }

    /// lower bound: accepts Shape or its superclasses
    static void addCircles(List<? super Circle> list) {
        list.add(new Circle());
        System.out.println("Circle added!");
    }

    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        drawShapes(circles); // ✅ works — Circle extends Shape

        List<Shape> shapes = new ArrayList<>();
        addCircles(shapes); // ✅ works — Shape is super of Circle
    }
}
