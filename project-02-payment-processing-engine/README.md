# Payment Processing Engine

Enterprise payment processing system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise applications process payments while ensuring data consistency, validation, and transaction reliability.

The system simulates a payment workflow where a payment request is validated, processed, stored, and returned with a transaction status.

---

## Features

- Create payment records
- Validate payment amount
- Process payment transactions
- Store payment status
- Handle failed transactions
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A customer submits a payment request.

If the payment amount is valid, the system processes the payment and stores it with a `SUCCESS` status.

If the payment amount is invalid, the transaction fails and returns an error.

---

## API Endpoints

### Health Check

```http
GET /
```

### Process Payment

```http
POST /payments
```

Example Request:

```json
{
  "customerName": "Ahmad",
  "amount": 1500,
  "paymentMethod": "CARD"
}
```

### Get All Payments

```http
GET /payments
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

- Payment workflow design
- Spring Transaction Management
- REST API development
- Data consistency
- Error handling
- Backend service architecture
- Financial system logic

---

## Author

Alhanoof Alabdullah
