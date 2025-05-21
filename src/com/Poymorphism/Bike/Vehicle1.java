package com.Poymorphism.Bike;

import com.Poymorphism.Car.Accessory;
import com.Poymorphism.Car.Vehicle;

public class Vehicle1 extends Vehicle {
    String make;
    String model;

    Vehicle1(String make, String model) {
        super("tata", "t11");
        this.make = make;
        this.model = model;
    }
    public void start(){
        System.out.println(make + " " + model + " " + "starts");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle1("bike1", "A100");
        car.start();

        Accessory accessory = new Accessory("tyre", 4);
        accessory.start();

            }
}
