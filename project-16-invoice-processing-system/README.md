# Invoice Processing System

Enterprise invoice processing system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise systems process invoices while ensuring validation, transaction consistency, and reliable invoice lifecycle management.

The system simulates an invoice workflow where an invoice request is validated, calculated, processed, and stored with a payment status.

---

## Features

- Create invoice records
- Validate customer and invoice details
- Calculate invoice total
- Track invoice status
- Store invoice transactions
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A company issues an invoice to a customer.

If the invoice amount and tax rate are valid, the system calculates the final invoice total and stores the invoice with a `ISSUED` status.

If validation fails, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Create Invoice

POST /invoices

Example Request:

```json
{
  "customerName": "Ahmad",
  "invoiceNumber": "INV-1001",
  "baseAmount": 5000,
  "taxRate": 15
}
```

### Get All Invoices

GET /invoices

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

- Invoice processing workflows
- Tax calculation logic
- Spring Transaction Management
- REST API development
- Data consistency
- Enterprise backend architecture
- Financial system design

---

## Author

Alhanoof Alabdullah
