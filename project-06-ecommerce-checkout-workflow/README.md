# E-Commerce Checkout Workflow

Enterprise e-commerce checkout system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise e-commerce systems process checkout transactions while ensuring data consistency, validation, and reliable order payment handling.

The system simulates a checkout workflow where a customer submits a checkout request, the system validates the order amount, processes the checkout, and stores the transaction status.

---

## Features

- Create checkout transactions
- Validate customer details
- Validate checkout amount
- Store checkout status
- Handle failed checkout requests
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A customer completes an online checkout.

If the checkout amount is valid, the system processes the checkout and stores it with a `COMPLETED` status.

If the checkout amount is invalid, the transaction fails and rolls back automatically.

---

## API Endpoints

### Health Check

```http
GET /
```

### Process Checkout

```http
POST /checkout
```

Example Request:

```json
{
  "customerName": "Ahmad",
  "orderNumber": "ORD-1001",
  "amount": 2500,
  "paymentMethod": "CARD"
}
```

### Get All Checkouts

```http
GET /checkouts
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

- E-commerce checkout workflows
- Spring Transaction Management
- Payment validation
- Transaction consistency
- REST API development
- Backend service architecture
- Enterprise business logic

---

## Author

Alhanoof Alabdullah
