# Order Management System

Enterprise order management system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise applications manage customer orders while ensuring transactional consistency, validation, and reliable order processing.

The system simulates an order workflow where an order request is validated, processed, stored, and returned with an order status.

---

## Features

- Create customer orders
- Validate order details
- Store order records
- Track order status
- Handle invalid order requests
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A customer places an order for a product.

If the order quantity and price are valid, the system stores the order with a `CONFIRMED` status.

If the order information is invalid, the transaction fails and returns an error.

---

## API Endpoints

### Health Check

```http
GET /
```

### Create Order

```http
POST /orders
```

Example Request:

```json
{
  "customerName": "Ahmad",
  "productName": "Laptop",
  "quantity": 2,
  "unitPrice": 3500
}
```

### Get All Orders

```http
GET /orders
```

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

- Order workflow design
- Spring Transaction Management
- REST API development
- Data consistency
- Error handling
- Backend service architecture
- Enterprise system logic

---

## Author

Alhanoof Alabdullah
