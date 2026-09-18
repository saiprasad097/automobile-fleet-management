package com.dealership.model;

public abstract class Vehicle {
    private String vin;
    public Vehicle(String vin) { this.vin = vin; }
    public String getVin() { return vin; }
}
