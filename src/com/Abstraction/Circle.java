package com.Abstraction;


import java.awt.*;

public class Circle extends shape {

 double radius;
 String shapeName;

Circle(double r, String name ) {
    super(name);
    this.radius = r;
   this.shapeName = name;

}
    public void calcArea()
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + area);
            }

    public static void main(String[] args) {
        shape circle = new Circle(50,"Circle");
        circle.calcArea();
    }
}
