package com.dealership;

import com.dealership.config.DatabaseConfig;
import com.dealership.model.*;
import com.dealership.repository.*;
import com.dealership.service.*;
import com.dealership.util.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Database Tables
        DatabaseConfig.initializeDatabase();

        InventoryService inventoryService = new InventoryService();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("==========================================");
        System.out.println("  AUTOMOBILE FLEET & SALES SYSTEM");
        System.out.println("==========================================");

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. View Fleet Inventory");
            System.out.println("2. Process Vehicle Sale");
            System.out.println("3. Schedule Test Drive (Multithreaded)");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    inventoryService.displayInventory();
                    break;
                case "2":
                    System.out.print("Enter VIN to purchase: ");
                    String vin = scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customer = scanner.nextLine();

                    try {
                        inventoryService.processSale(vin, customer);
                    } catch (Exception e) {
                        System.out.println("Sale Error: " + e.getMessage());
                    }
                    break;
                case "3":
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter VIN: ");
                    String testVin = scanner.nextLine();
                    System.out.print("Enter Preferred Time (e.g., 10:00 AM): ");
                    String time = scanner.nextLine();

                    TestDriveSchedulerThread scheduler = new TestDriveSchedulerThread(inventoryService, name, testVin, time);
                    scheduler.start();
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
