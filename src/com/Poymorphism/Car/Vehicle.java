package com.Poymorphism.Car;

public class Vehicle {

            protected String make;
        protected String model;

        protected Vehicle(String make1, String model1){
            make = make1;
            model = model1;
        }

        public void start(){
            System.out.println(make + " " + model + " " + "starts");
        }
    }


