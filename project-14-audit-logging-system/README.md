# Audit Logging System

Enterprise audit logging system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise systems record important business activities, transaction events, and user actions for auditing, compliance, and monitoring purposes.

The system simulates an audit logging workflow where each important action is captured, validated, stored, and made available for review.

---

## Features

- Create audit log records
- Track user actions
- Store event type and description
- Capture transaction status
- Maintain audit trail
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

An enterprise system needs to record important user or transaction activities.

When an action occurs, the system stores an audit record containing the username, action type, description, and status.

This helps support compliance, troubleshooting, monitoring, and transaction traceability.

---

## API Endpoints

### Health Check

GET /

### Create Audit Log

POST /audit-logs

Example Request:

```json
{
  "username": "Ahmad",
  "actionType": "PAYMENT_CREATED",
  "description": "Payment transaction was created successfully",
  "status": "SUCCESS"
}
```

### Get All Audit Logs

GET /audit-logs

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

- Audit logging workflows
- Transaction traceability
- Compliance-oriented backend design
- Spring Transaction Management
- REST API development
- Enterprise monitoring logic
- Data consistency

---

## Author

Alhanoof Alabdullah
