# Multi-Currency Transfer System

Enterprise multi-currency transfer system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise financial systems handle cross-currency transfers while ensuring validation, transaction consistency, and reliable currency conversion workflows.

The system simulates a transfer workflow where a customer sends money from one currency to another using an exchange rate.

---

## Features

- Process multi-currency transfers
- Validate sender and receiver details
- Validate transfer amount
- Apply exchange rate calculation
- Store transfer status
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A customer transfers money from one currency to another.

The system validates the transfer amount and exchange rate, calculates the converted amount, and stores the transfer with a `COMPLETED` status.

If the transfer amount or exchange rate is invalid, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Create Currency Transfer

POST /currency-transfers

Example Request:

```json
{
  "senderName": "Ahmad",
  "receiverName": "Sara",
  "sourceCurrency": "SAR",
  "targetCurrency": "USD",
  "amount": 3750,
  "exchangeRate": 0.27
}
```

### Get All Currency Transfers

GET /currency-transfers

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

- Multi-currency transfer workflows
- Exchange rate calculation
- Spring Transaction Management
- Financial transaction validation
- Data consistency
- REST API development
- Backend service architecture

---

## Author

Alhanoof Alabdullah
