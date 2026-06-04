# Distributed Transaction Demo

Enterprise distributed transaction demo built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise applications handle transactions across multiple business operations while maintaining consistency and reliability.

The system simulates a distributed transaction workflow where a transaction passes through multiple stages such as validation, processing, confirmation, and completion.

---

## Features

- Create distributed transaction records
- Validate transaction input
- Simulate multi-step transaction processing
- Track transaction stages
- Store transaction status
- Apply Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A financial transaction moves through multiple internal systems.

If all validation and processing steps succeed, the transaction is stored with a `COMPLETED` status.

If validation fails, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Process Distributed Transaction

POST /distributed-transactions

Example Request:

```json
{
  "customerName": "Ahmad",
  "transactionType": "PAYMENT",
  "amount": 3000,
  "sourceSystem": "Wallet Service",
  "targetSystem": "Payment Service"
}
```

### Get All Distributed Transactions

GET /distributed-transactions

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

- Distributed transaction concepts
- Multi-step workflow processing
- Spring Transaction Management
- Data consistency
- Backend service architecture
- Enterprise system reliability
- Error handling

---

## Author

Alhanoof Alabdullah
