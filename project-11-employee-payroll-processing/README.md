# Employee Payroll Processing

Enterprise payroll processing system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise systems process employee payroll while ensuring salary validation, transaction consistency, and reliable payroll record management.

The system simulates a payroll workflow where employee salary information is validated, payroll is processed, and the payment status is stored.

---

## Features

- Create payroll records
- Validate employee information
- Validate salary amount
- Process payroll transactions
- Track payroll status
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

An organization processes payroll for employees.

If the employee name and salary amount are valid, the payroll transaction is processed and stored with a `PROCESSED` status.

If validation fails, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Process Payroll

POST /payroll

Example Request:

```json
{
  "employeeName": "Ahmad",
  "department": "Finance",
  "salaryAmount": 12000
}
```

### Get All Payroll Records

GET /payroll

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

- Payroll processing workflows
- Spring Transaction Management
- Enterprise HR systems
- Salary validation
- Data consistency
- REST API development
- Backend service architecture

---

## Author

Alhanoof Alabdullah
