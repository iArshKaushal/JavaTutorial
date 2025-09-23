package org.akk.oop2_advance.f_object_cloning.shallow_copy;


class Point implements Cloneable{
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Point clone() {
        try {
            return (Point) super.clone(); // shallow copy is enough for primitives
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // can't happen: we implement Cloneable
        }
    }

}

public class BasicShallowCopyEx1 {
    public static void main(String[] args) {

    }
}
