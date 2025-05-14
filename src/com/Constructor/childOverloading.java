package com.Constructor;

public class childOverloading extends parentOverloading {
    childOverloading() {
       super(20, 30);
        System.out.println("value of parent class variable a is : " + super.a);
        System.out.println("value of parent class variable b is : " + super.b);
        System.out.println("child class constructor");

    }

    public static void main(String[] args) {
        childOverloading obj = new childOverloading();
    }
}
