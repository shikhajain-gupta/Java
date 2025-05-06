package com.Constructor;

public class parentOverloading {
    int a;
    int b;

    parentOverloading() {
      this(3,4);
        System.out.println("default constructor");
    }

    parentOverloading(int a, int b) {
        System.out.println("parameter constructor");
        this.a = a;
        this.b = b;
        sum(this.a, this.b);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        parentOverloading obj = new parentOverloading();
        System.out.println("value of parent class variable a is" + obj.a);
        System.out.println("value of parent class variable b is" + obj.b);
        obj.sum(1, 2);

    }
}
