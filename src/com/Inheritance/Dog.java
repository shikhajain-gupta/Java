package com.Inheritance;

public class Dog extends Animal {
    private static int breed;
    private static String color;

    Dog(int breed1, String color1) {
        super(2,"tuffy");
        breed = breed1;
        color = color1;
        System.out.println("calling dog class constructor");
            }

    public void displayDetails(){
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
       Dog dog = new Dog(5,"white");
       dog.displayDetails();

        Animal animal = new Dog(4,"black");
        animal.displayDetails();
        breed = 7;
        animal.displayDetails();

    }



}
