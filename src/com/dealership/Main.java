package com.dealership;

import com.dealership.exception.VehicleNotFoundException;
import com.dealership.model.Car;
import com.dealership.model.Vehicle;
import com.dealership.util.AsyncLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vehicle> inventory = new ArrayList<>();

    public static void main(String[] args) {
        inventory.add(new Car("V101", "Sedan X", 25000.0, "Petrol"));
        inventory.add(new Car("V102", "EV Storm", 42000.0, "Electric"));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("==========================================");
        System.out.println(" Automobile Fleet & Sales Management CLI ");
        System.out.println("==========================================");

        while (running) {
            System.out.println("\n1. View Inventory");
            System.out.println("2. Add Vehicle");
            System.out.println("3. Purchase Vehicle");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\n--- Current Inventory ---");
                    for (Vehicle v : inventory) {
                        v.displayDetails();
                    }
                    break;

                case "2":
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter Fuel/Type: ");
                    String type = scanner.nextLine();

                    inventory.add(new Car(id, model, price, type));
                    System.out.println("Vehicle added successfully!");
                    break;

                case "3":
                    System.out.print("Enter Vehicle ID to purchase: ");
                    String pId = scanner.nextLine();
                    try {
                        Vehicle found = null;
                        for (Vehicle v : inventory) {
                            if (v.getId().equalsIgnoreCase(pId)) {
                                found = v;
                                break;
                            }
                        }
                        if (found == null) {
                            throw new VehicleNotFoundException("Vehicle ID " + pId + " not found!");
                        }

                        inventory.remove(found);
                        System.out.println("Purchase complete for " + found.getModel() + "!");

                        String record = "Purchased: " + found.getModel() + " ($" + found.getPrice() + ")";
                        new Thread(new AsyncLogger(record)).start();

                    } catch (VehicleNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "4":
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}