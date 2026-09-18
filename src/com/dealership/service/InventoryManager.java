package com.dealership.service;

import com.dealership.exception.VehicleNotFoundException;
import com.dealership.model.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Vehicle> inventory = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    public Vehicle findVehicleById(String id) throws VehicleNotFoundException {
        for (Vehicle v : inventory) {
            if (v.getId().equalsIgnoreCase(id)) {
                return v;
            }
        }
        throw new VehicleNotFoundException("Vehicle with ID '" + id + "' was not found in inventory.");
    }
}