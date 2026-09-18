



# The Automobile Fleet \& Sales Management System



## Overview

The Automobile Fleet \& Sales Management System is a command-line interface (CLI) application developed in Java. Built for automobile dealerships and fleet operators, it facilitates vehicle inventory management, processes purchase transactions, and handles dynamic logging. The application incorporates key Object-Oriented Programming (OOP) concepts, custom exception handling, multithreading for asynchronous background file logging, and Java File I/O streams.



## Features



* &#x20;Vehicle Inventory Tracking: View, search, and add various vehicle models dynamically using class inheritance.
* &#x20;Sales Transaction Processing: Execute customer orders with input validation and real-time inventory updates.
* Multi-Threaded File Logging: Asynchronously write transaction receipts and audit records to external text files without blocking user input.
* Custom Exception Handling: Catch out-of-stock errors, bad input formats, and non-existent vehicle IDs cleanly.







## Technologies Used



* Programming Language: Java 
* Architecture: Object-Oriented Architecture
* Concurrency: Java Multithreading \& Synchronization Methods
* File System: Java Character Streams 
* Version Control: Git \& GitHub







## Project Directory Structure



automobile-fleet-management/

├── statement.md

├── README.md

└── src/

└── com/

└── dealership/

├── Main.java

├── model/

│   ├── Vehicle.java

│   ├── Car.java

│   └── Truck.java

├── service/

│   ├── InventoryManager.java

│   └── TransactionProcessor.java

├── exception/

│   ├── InsufficientStockException.java

│   └── VehicleNotFoundException.java

└── util/

└── AsyncFileLogger.java



## Environment Setup \& Prerequisites



1\. Install Java Development Kit (JDK 17 or later).

2\. Verify Java installation by running:

java -version

javac -version

3\. Ensure Git is installed for version tracking.



## Compilation \& Execution Instructions



1\. Clone the Repository

git clone \[https://github.com/your-username/automobile-fleet-management.git](https://www.google.com/search?q=https://github.com/your-username/automobile-fleet-management.git\&utm\_source=gemini)

cd automobile-fleet-management

2\. Compile the Java Source Files

From the project root folder, run:

javac -d out src/com/dealership/\*.java src/com/dealership/\*/\*.java

3\. Run the Application

Execute the compiled bytecode using the CLI:

java -cp out com.dealership.Main



## Testing Instructions



* Option 1: View Inventory - Enter 1 to display available vehicle stock.
* Option 2: Purchase Vehicle - Enter 2 and input a valid Vehicle ID to simulate an order. Check the root directory for a newly generated transaction log file.
* Option 3: Test Error Handling - Enter 2 and input an invalid ID (e.g., 999) to verify custom exception handling.
* Option 4: Add New Vehicle - Enter 3 to add a new car or truck to the active inventory list.

## 

## Output

===========================================

=== AUTOMOBILE FLEET MANAGEMENT SYSTEM ===

===========================================

1\. View Vehicle Inventory

2\. Purchase / Order Vehicle

3\. Add New Vehicle to Fleet

4\. Exit

Select an option: 1



\--- Current Inventory ---

ID: V101 | Model: Sedan GT | Type: Car | Price: $25000.0 | Stock: 5

ID: V102 | Model: HaulerX  | Type: Truck | Price: $45000.0 | Stock: 2















