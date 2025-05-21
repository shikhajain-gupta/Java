package com.Abstraction;

import java.awt.*;

public class rectangle extends shape {

    int length;
    int breadth;
    String shapeName;

    rectangle(int l, int b, String name ) {
        super(name);
        this.length = l;
        this.breadth = b;

    }
    public void calcArea()
    {
        double area = length * breadth;
        System.out.println("Area of rectangle is " + area);
    }

    public static void main(String[] args) {
        shape rec = new rectangle(20, 30, "rectangle");
        rec.calcArea();
    }
}
