# Order Management System

This repository contains an **Order Management System** built with **Java Spring Boot**. The system allows users to place orders, process payments, and receive notifications, with a modular architecture for scalability, readability, and maintainability. PostgreSQL is used for database management, set up via Docker for easy configuration.

---

## Table of Contents

- [Project Overview](#project-overview)
- [Principles and Patterns](#principles-and-patterns)
- [Diagrams](#diagrams)
  - [Use Case Diagram](#use-case-diagram)
  - [System Sequence Diagram](#system-sequence-diagram)
  - [Communication Diagram](#communication-diagram)
  - [Class Diagram](#class-diagram)
  - [Package Diagram](#package-diagram)
- [Code Structure](#code-structure)
- [Database Setup with Docker](#database-setup-with-docker)
- [Running the Project](#running-the-project)
- [Video Explanation](#video-explanation)

---

## Project Overview

This Order Management System follows **Object-Oriented Design** principles and uses **Design Patterns** such as **Strategy Pattern** for payment processing and **Dependency Injection** for flexibility. The project is organized into packages representing domains (e.g., `order`, `payment`, `customer`) for a clean, modular design.

---

## Principles and Patterns

The project incorporates several design principles and patterns to ensure it’s scalable, maintainable, and easy to extend. Here’s a detailed breakdown of each principle and pattern used:

### 1. **SOLID Principles**

- **Single Responsibility Principle (SRP)**: Each service or class has a distinct responsibility, such as `OrderService` for managing order-related logic and `NotificationService` for handling notifications.
- **Open/Closed Principle (OCP)**: The `PaymentStrategy` interface allows adding new payment methods without modifying existing classes, enabling extensibility.
- **Liskov Substitution Principle (LSP)**: Any `PaymentStrategy` implementation (e.g., `CreditCardPayment`, `PayPalPayment`) can be substituted without affecting the behavior of the application.
- **Interface Segregation Principle (ISP)**: Separate interfaces for services (like `NotificationService`, `OrderService`, `PaymentService`) prevent classes from depending on methods they don’t use.
- **Dependency Inversion Principle (DIP)**: High-level modules depend on abstractions rather than concrete implementations. Dependencies are injected into classes, decoupling components and simplifying testing.

### 2. **Design Patterns**

- **Dependency Injection (DI)**: Spring Boot’s DI container injects dependencies, such as `OrderService` into `OrderController`, which facilitates modular and testable code by reducing class dependencies on concrete implementations.
- **Strategy Pattern**: The `PaymentStrategy` interface and its implementations (`CreditCardPayment`, `PayPalPayment`) allow switching between payment methods dynamically.
- **Observer Pattern**: Notifications use an **Observer Pattern** where `NotificationService` observes changes to order status. For example, when an order is placed or its status changes, the service sends notifications to customers.
- **Repository Pattern**: Classes like `OrderRepository` and `RestaurantRepository` abstract database operations from business logic, improving code readability and maintainability.
- **Factory Pattern**: Factory methods are used to create instances of specific implementations, like `NotificationServiceImpl` or `PaymentServiceImpl`, promoting separation of concerns and modularity.
- **Template Method Pattern**: `NotificationService` uses a template method for defining a standard notification-sending process, with specific notification types implemented in subclasses.
- **Singleton Pattern**: Certain utility classes (e.g., `AppConfig`) can be implemented as singletons to maintain a single, shared instance of configuration settings across the application.

### 3. **Architectural Patterns**

- **Layered Architecture**: The project follows a layered structure with packages organized by function—controller, service, repository, and model layers—encouraging separation of concerns.
- **Domain-Driven Design (DDD)**: Each domain, such as `Order`, `Customer`, `Payment`, and `Notification`, is structured as an individual module, improving domain-focused development and clarity.

### 4. **Separation of Concerns (SoC)**

- The project structure isolates different areas of functionality (e.g., `order`, `payment`, `notification`) to maintain modularity, readability, and maintainability across the codebase.

---

## Diagrams

The following UML diagrams provide a high-level view of the system.

### 1. Use Case Diagram

The **Use Case Diagram** illustrates core functionalities, such as placing an order, validating payments, processing transactions, and receiving notifications, showing the interactions between the system and the customer.

### 2. System Sequence Diagram

The **System Sequence Diagram** shows the interactions required to place an order, from receiving the request in **OrderController** to completing the transaction and sending a notification.

### 3. Communication Diagram

The **Communication Diagram** displays the order of interactions among components (e.g., `OrderController`, `OrderService`, `PaymentService`, `NotificationService`) in processing an order.

### 4. Class Diagram

The **Class Diagram** depicts key classes in the system, like `OrderService`, `PaymentService`, and `NotificationService`, and their relationships, serving as a blueprint for the code.

### 5. Package Diagram

The **Package Diagram** represents the project structure at a high level, grouping related classes into packages for modularity and clarity.

---

## Code Structure

The project has a modular structure to keep related components organized. Here is the directory layout:

```
orderapp
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── orderapp
│   │               ├── config           # App configuration
│   │               ├── customer         # Customer module
│   │               ├── notification     # Notification module
│   │               ├── order            # Order module
│   │               ├── payment          # Payment module with strategies
│   │               └── restaurant       # Restaurant module
│   │               └── Main.java        # Spring Start
│   └── resources
│       ├── application.yml             # Application properties
│       ├── static                      # Static resources (if any)
│       └── templates                   # Templates (e.g., HTML)
├── docker-compose.yaml                 # Docker configuration for PostgreSQL
└── README.md                           # Documentation
```

Each package includes relevant classes, such as services, controllers, models, and repositories, aligned with the **Dependency Injection** and **Single Responsibility** principles.

---

## Database Setup with Docker

A **PostgreSQL** database is configured using Docker, making setup and deployment consistent across environments.

### Steps to Start PostgreSQL with Docker

1. **Install Docker**: Ensure you have Docker installed. [Get Docker here](https://www.docker.com/get-started).

2. **Run Docker Compose**:

   - The `docker-compose.yaml` file is preconfigured with a PostgreSQL setup.
   - To start PostgreSQL, navigate to the `orderapp` directory and run:
     ```bash
     docker-compose up -d
     ```
   - This will start a PostgreSQL container with the specified configuration.

3. **Database Credentials**:
   - Update `application.yml` to match your Docker PostgreSQL configuration, if necessary:
     ```yaml
     spring:
       datasource:
         url: jdbc:postgresql://localhost:5432/orderdb
         username: postgres
         password: password
     ```

---

## Running the Project

### Prerequisites

- **Java 17** or higher
- **Maven**
- **Docker**
- **Docker Compose**

### Steps to Run the Spring Boot Application

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/KashifKhn/Software_Architecture_Design
   cd Software_Architecture_Design/labs/Assignment-1-Solution
   ```

2. **Build the Project**:

   ```bash
   mvn clean install
   ```

3. **Run the Project**:

   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**:
   - The application runs on `http://localhost:8080`.
   - **Endpoints**:
     - Place an Order: `POST /orders`
     - Track Order Status: `GET /orders/{orderId}`
     - Payment Status: `GET /payments/status/{orderId}`
     - Send Notification: `POST /notifications/send`

---

## Video Explanation

For a complete walkthrough, watch the video below explaining the project setup, structure, and each of the diagrams.

[Video Explanation](https://drive.google.com/file/d/1O6tPSrR0IHRUh-oM8Q0yYo3n2JtcuNpP/view?usp=drive_link)
