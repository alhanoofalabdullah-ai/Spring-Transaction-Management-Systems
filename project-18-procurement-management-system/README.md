# Procurement Management System

Enterprise procurement management system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise procurement systems manage purchase requests, supplier information, approval workflows, and transaction consistency.

The system simulates a procurement workflow where a purchase request is submitted, validated, evaluated, and stored with an approval status.

---

## Features

- Create procurement requests
- Validate requester details
- Validate supplier information
- Validate purchase amount
- Approve or reject procurement requests
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

An employee submits a procurement request for purchasing goods or services.

If the purchase amount is within the allowed approval limit, the request is stored with an `APPROVED` status.

If the purchase amount exceeds the limit, the request is stored with a `REVIEW_REQUIRED` status.

---

## API Endpoints

### Health Check

GET /

### Create Procurement Request

POST /procurements

Example Request:

```json
{
  "requesterName": "Ahmad",
  "supplierName": "Tech Supplier Co.",
  "itemName": "Laptop",
  "quantity": 5,
  "unitPrice": 3500
}
```

### Get All Procurement Requests

GET /procurements

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

- Procurement workflow design
- Purchase request validation
- Approval logic
- Spring Transaction Management
- REST API development
- Data consistency
- Enterprise backend architecture

---

## Author

Alhanoof Alabdullah
