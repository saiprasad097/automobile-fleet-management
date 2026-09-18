package com.dealership.model;

public abstract class Vehicle {
    private String id;
    private String model;
    private double price;

    public Vehicle(String id, String model, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public String getId() { return id; }
    public String getModel() { return model; }
    public double getPrice() { return price; }

    public abstract void displayDetails();
}