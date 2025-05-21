package com.Poymorphism.Car;

public class Accessory {
    public String tyreName;
    public int lights;

    public Accessory(String tyreName, int lights) {
        this.tyreName = tyreName;
        this.lights = lights;
            }

            public void start(){
        System.out.println("Tyre Name: " + tyreName);
        System.out.println("Lights: " + lights);
            }

}
