# Inventory Transaction System

Enterprise inventory management system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how inventory transactions are processed in enterprise applications while ensuring stock consistency, transaction integrity, and rollback support.

The system simulates product stock updates when items are added or removed from inventory.

---

## Features

- Product inventory management
- Stock increase transactions
- Stock decrease transactions
- Inventory validation
- Automatic rollback support
- REST API integration
- Transaction consistency

---

## Business Scenario

Warehouse staff update product inventory.

If sufficient stock exists, inventory is updated successfully.

If stock is insufficient, the transaction fails and rolls back automatically.

---

## API Endpoints

### Add Stock

POST /inventory/add

### Remove Stock

POST /inventory/remove

### Get Products

GET /products

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Spring Transactions
- Hibernate
- MySQL
- REST API
- Maven

---

## Skills Developed

- Inventory Management
- Transaction Handling
- Stock Validation
- Spring Transactions
- REST API Development
- Backend Engineering

---

## Author

Alhanoof Alabdullah
