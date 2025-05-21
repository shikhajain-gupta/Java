package com.Abstraction;

public abstract class shape {
    String shapeName;

    shape(String Name) {
       shapeName = Name;
       System.out.println("Shape : " + shapeName);
    }

    public abstract void calcArea();
}
