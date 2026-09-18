package com.dealership.model;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String id, String model, double price, int stock, double payloadCapacity) {
        super(id, model, price, stock);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() { return payloadCapacity; }

    @Override
    public String getVehicleType() {
        return "Truck";
    }
}