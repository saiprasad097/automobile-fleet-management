package com.dealership.model;

public class Car extends Vehicle {
    private String fuelType;

    public Car(String id, String model, double price, String fuelType) {
        super(id, model, price);
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId() + " | Model: " + getModel() +
                " | Price: $" + getPrice() + " | Type: " + fuelType);
    }
}