package com.example.shapes;

import com.example.shapes.Rectangle;
import com.example.shapes.Shape;
import com.example.shapes.Square;

public class Test {
    static void getAreaTest(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rc = new Rectangle(2, 3);
        getAreaTest(rc);

        // Create a Square object
        Square sq = new Square(5);
        getAreaTest(sq);
    }
}
