# Healthcare Billing System

Enterprise healthcare billing system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how healthcare systems process patient billing while ensuring transaction consistency, validation, and reliable billing status management.

The system simulates a healthcare billing workflow where a patient bill is created, validated, calculated, and stored with a billing status.

---

## Features

- Create healthcare bills
- Validate patient information
- Validate service cost
- Calculate total billing amount
- Track billing status
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A healthcare provider generates a bill for a patient.

If the patient details and service cost are valid, the bill is created and stored with an `ISSUED` status.

If validation fails, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Create Healthcare Bill

POST /healthcare-bills

Example Request:

```json
{
  "patientName": "Ahmad",
  "serviceName": "Medical Consultation",
  "serviceCost": 500,
  "insuranceCoverage": 200
}
```

### Get All Healthcare Bills

GET /healthcare-bills

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

- Healthcare billing workflows
- Financial transaction validation
- Spring Transaction Management
- REST API development
- Data consistency
- Enterprise backend architecture
- Billing system design

---

## Author

Alhanoof Alabdullah
