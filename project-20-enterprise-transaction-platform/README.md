# Enterprise Transaction Platform

Final enterprise transaction management platform built using Spring Boot and Spring Transaction Management.

---

## Overview

This project represents the final and most advanced project in the Spring Transaction Management Systems repository.

It demonstrates how enterprise applications manage different transaction types such as payments, transfers, refunds, billing, payroll, procurement, and financial operations while ensuring validation, reliability, and transaction consistency.

---

## Features

- Create enterprise transaction records
- Validate transaction details
- Support multiple transaction types
- Track transaction status
- Store transaction references
- Use Spring Transaction Management
- Return REST API responses
- Simulate enterprise financial workflows

---

## Business Scenario

An enterprise platform receives different types of transaction requests.

The system validates the customer name, transaction type, amount, and reference number.

If the transaction details are valid, the transaction is stored with a `SUCCESS` status.

If validation fails, the transaction is rejected.

---

## Supported Transaction Types

- PAYMENT
- TRANSFER
- REFUND
- BILLING
- PAYROLL
- PROCUREMENT
- HEALTHCARE_BILLING

---

## API Endpoints

### Health Check

```http
GET /
```

### Create Enterprise Transaction

```http
POST /enterprise-transactions
```

Example Request:

```json
{
  "customerName": "Ahmad",
  "transactionType": "PAYMENT",
  "amount": 2500,
  "referenceNumber": "ENT-1001"
}
```

### Get All Enterprise Transactions

```http
GET /enterprise-transactions
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

- Enterprise transaction management
- Spring Transaction Management
- Financial workflow processing
- Transaction validation
- Data consistency
- Backend service architecture
- REST API development
- Business operation modeling

---

## Author

Alhanoof Alabdullah
