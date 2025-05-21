package com.Inheritance;

public class Animal {
    private int age;
    private String name;

    Animal(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("calling animal class constructor");
            }

            public void displayDetails() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
                    }
}
