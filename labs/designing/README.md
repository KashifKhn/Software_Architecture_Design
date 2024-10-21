# Place Order System - SDA Project

## Overview

This project is a **Java Spring Boot** implementation of a **Food Delivery Order System** based on the "Place Order" use case. The system is designed following **best practices** and **design patterns** to ensure modularity, maintainability, and scalability.

The project was developed as part of the **Software Design and Architecture (SDA) course**, demonstrating effective use of layered architecture, design principles, and patterns.

## Architecture

The system is built using a **layered architecture** that separates concerns into different modules:

1. **Presentation Layer:** Manages the interaction with users and handles HTTP requests.
2. **Service Layer:** Contains business logic.
3. **Data Access Layer:** Manages interactions with the database.

## Design Principles

The following design principles are applied:

- **Separation of Concerns:** Each module handles specific tasks, improving maintainability.
- **Single Responsibility Principle (SRP):** Each class has a single responsibility.
- **Dependency Injection (DI):** Dependencies are injected using Spring's DI mechanism, promoting loose coupling.
- **SOLID Principles:** Ensuring scalable, robust, and maintainable code.

## Use Case Diagrams

The **Use Case Diagram** illustrates the interactions between the primary actor (Customer) and the system for the "Place Order" scenario. The diagram defines how different components collaborate to complete an order successfully.

## Class Diagram

The **Class Diagram** shows the structure of the system, including classes, attributes, and methods, as well as relationships between the objects. This diagram follows object-oriented design principles.

## Communication Diagram

The **Communication Diagram** represents the interaction between objects in the system for the "Place Order" process. It visualizes how components communicate to fulfill an order request.

## Design Patterns

The project demonstrates the use of several design patterns:

1. **Strategy Pattern:** Used for processing different payment methods.
2. **Factory Pattern:** For object creation (e.g., different types of services).
3. **Observer Pattern:** To notify customers and restaurants about order status updates.
4. **Repository Pattern:** Ensures clean separation between business logic and data access.
5. **Dependency Injection:** Promotes loose coupling between components.

## Technologies

- **Java Spring Boot:** Framework for building the backend services.
- **Hibernate/JPA:** ORM for database interactions.
- **MySQL:** Database for storing order, customer, and restaurant data.
- **UML Diagrams:** Created using various tools to plan and visualize system architecture.
- **GitHub:** Code hosting and version control.
