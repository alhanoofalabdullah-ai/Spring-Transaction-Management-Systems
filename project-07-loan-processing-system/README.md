# Loan Processing System

Enterprise loan processing system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how financial institutions process loan applications while ensuring validation, transaction consistency, and reliable data handling.

The system simulates a loan workflow where a customer submits a loan request, the system validates the loan amount and income, processes the request, and stores the loan decision status.

---

## Features

- Submit loan applications
- Validate customer details
- Validate loan amount
- Validate income eligibility
- Store loan decisions
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A customer applies for a loan.

If the requested loan amount is valid and the customer income meets eligibility rules, the loan is approved and stored with an `APPROVED` status.

If the loan request does not meet the rules, it is stored with a `REJECTED` status.

---

## API Endpoints

### Health Check

```http
GET /
```

### Apply for Loan

```http
POST /loans
```

Example Request:

```json
{
  "customerName": "Ahmad",
  "monthlyIncome": 12000,
  "loanAmount": 50000
}
```

### Get All Loans

```http
GET /loans
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

- Loan processing workflows
- Financial eligibility validation
- Spring Transaction Management
- REST API development
- Data consistency
- Enterprise backend architecture
- Financial system design

---

## Author

Alhanoof Alabdullah
