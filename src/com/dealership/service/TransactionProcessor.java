package com.dealership.service;

import com.dealership.exception.InsufficientStockException;
import com.dealership.exception.VehicleNotFoundException;
import com.dealership.model.Vehicle;
import com.dealership.util.AsyncFileLogger;

public class TransactionProcessor {
    private InventoryManager inventoryManager;

    public TransactionProcessor(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

    public synchronized void processOrder(String vehicleId, int quantity)
            throws VehicleNotFoundException, InsufficientStockException {
        Vehicle vehicle = inventoryManager.findVehicleById(vehicleId);

        if (vehicle.getStock() < quantity) {
            throw new InsufficientStockException("Requested quantity (" + quantity +
                    ") exceeds available stock (" + vehicle.getStock() + ").");
        }

        vehicle.setStock(vehicle.getStock() - quantity);
        double totalPrice = vehicle.getPrice() * quantity;

        String logMessage = "PURCHASE | ID: " + vehicle.getId() +
                " | Model: " + vehicle.getModel() +
                " | Qty: " + quantity +
                " | Total: $" + totalPrice;

        System.out.println("[SUCCESS] Order processed successfully for " + vehicle.getModel());
        System.out.println("Total Amount: $" + totalPrice);

        AsyncFileLogger.logAsync(logMessage);
    }
}