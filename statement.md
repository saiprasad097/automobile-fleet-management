# 

# Automobile Fleet \& Maintenance Management Engine

# 

* # Problem Statement \& Scope





* ## Problem Statement



Automobile dealerships and fleet management systems have challenges of tracking vehicle availability, conducting sales transactions in real time and keeping logs without hindering users' operations. Manual procedures create issues of concurrency conflict, untracked inventory changes and lack of transparency of operations. There is an urgent need of developing thread-safe and modular systems that can validate user inputs, process concurrent purchases and conduct asynchronous file I/O operations from terminal environments.





* ## Scope of the Project

This project offers a light weight CLI Automobile Fleet \& Sales Management system developed in Java programming language. This system allows users to manage fleet inventories using OOP techniques, make purchases, process exceptions for invalid queries and asynchronous transaction logs using Java multithreading and file I/O streams. The system runs entirely on command line without having any Graphical User Interface at all, for providing high efficiency and zero dependency deployment.







* ## Target Users
* Dealership Fleet Managers
* Sales Executives
* System Auditors/Managers
* Functional Requirements







* ## Functional Requirements



* Inventory Management Module: Adding of new vehicles, displaying fleet inventory and dynamic queries of stock details.
* Order \& Transaction Engine: Processing vehicle purchasing, calculating billing amounts and updating of inventory.
* Asynchronous File Audit Logger: Writes invoices for customers and sales information into non-volatile files in parallel mode without causing any blocking in the terminal menu. 







* ## Non-functional requirements 



* Concurrency \& Thread Safety: Multi-threading of background tasks does not create any race condition while updating stocks.  
* Fault Tolerance \& Error Handling: User-defined runtime exceptions handle out-of-stock products, incorrect vehicle IDs and other errors gracefully.   
* Zero GUI Portability: Ability to execute in any standard terminal environment through standard Java runtime libraries.   
* Maintainability \& Clean Architecture: Separation of models, service layer, custom exceptions and file handling utilities in modules.   









* ## High-Level Features





* Object-oriented hierarchy of vehicles: Inheritance and method overriding have been used in the implementation.
* Input validation \& Exception handling: Custom exceptions prevent crashes on erroneous input in operational scenarios.
* Parallel auditing logging: Concurrent execution pipelines ensure that background task does not slow down the terminal menu execution.
* Streams-based storage: Use of character and byte streams to store logs of completed transactions in audit format.





