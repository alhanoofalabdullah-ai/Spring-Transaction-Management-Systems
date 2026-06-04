# Enterprise Financial Platform

End-to-end enterprise financial transaction platform built using Spring Boot and Spring Transaction Management.

---

## Overview

This project represents the final project in the Spring Transaction Management Systems repository.

It demonstrates how enterprise financial platforms manage critical transaction operations while ensuring data consistency, validation, rollback support, and reliable financial workflow processing.

The system simulates a financial transaction platform that can process deposits, withdrawals, payments, and transfers while maintaining transaction integrity.

---

## Features

- Create financial transactions
- Process deposits
- Process withdrawals
- Process payments
- Track transaction status
- Validate transaction amounts
- Apply Spring Transaction Management
- Maintain financial data consistency
- Return REST API responses

---

## Business Scenario

A financial platform receives a customer transaction request.

The system validates the transaction type and amount.

If the transaction is valid, it is processed and stored with a `SUCCESS` status.

If the transaction is invalid, it is rejected and stored with a `FAILED` status.

---

## API Endpoints

### Health Check

```http
GET /
```

### Create Transaction

```http
POST /transactions
```

Example Request:

```json
{
  "customerName": "Ahmad",
  "transactionType": "PAYMENT",
  "amount": 2500,
  "referenceNumber": "TXN-1001"
}
```

### Get All Transactions

```http
GET /transactions
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

- Enterprise financial systems
- Transaction management
- Data consistency
- Financial workflow processing
- REST API development
- Backend service architecture
- Error handling
- Transaction status tracking

---

## Author

Alhanoof Alabdullah
