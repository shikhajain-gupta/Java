package com.encapsulation;

public class laptop {
    private String brand;
    private String model;
    private String processor;
    private int price;
    private String ramSize;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }


    laptop() {
        this.brand = "HP";
            }

    laptop(String brand, String model, String processor, int price, String ramSize) {
        setBrand(brand);
        setModel(model);
        setProcessor(processor);
        setPrice(price);
        setRamSize(ramSize);
    }

    laptop(String brand, String processor, int price) {
        setBrand(brand);
        setProcessor(processor);
        setPrice(price);
    }

    public static void main(String[] args) {
        laptop l = new laptop();
        System.out.println("default constructor" +  " " + l.brand);

        laptop l2 = new laptop("dell", "A1", "quad", 2000, "32GB");
        System.out.println("Getting values parameters from 5 parameter constructor " + " : " + l2.getBrand() + "  " + l2.getModel() + "  " + l2.getProcessor() + "  " + l2.getPrice() + "  " + l2.getRamSize());

        laptop l3 = new laptop("hP", "intel", 5000);
        System.out.println("Getting values parameters from 3 parameter constructor " + " : " + l3.brand + "  " + l3.processor + "  " + l3.price);

    }

}
