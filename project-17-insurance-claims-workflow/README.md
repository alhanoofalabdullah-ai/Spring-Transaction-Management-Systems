# Insurance Claims Workflow

Enterprise insurance claims processing system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise insurance systems process claims while ensuring validation, transaction consistency, and reliable claim decision handling.

The system simulates an insurance claim workflow where a customer submits a claim request, the system validates the claim amount and policy details, then stores the claim with an approval status.

---

## Features

- Create insurance claims
- Validate policy number
- Validate claim amount
- Approve or reject claims
- Store claim status
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A customer submits an insurance claim.

If the policy number and claim amount are valid, the claim is reviewed and stored with an `APPROVED` or `REJECTED` status based on business rules.

If required information is missing, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Submit Insurance Claim

POST /claims

Example Request:

```json
{
  "customerName": "Ahmad",
  "policyNumber": "POL-1001",
  "claimAmount": 12000,
  "claimReason": "Vehicle damage"
}
```

### Get All Claims

GET /claims

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

- Insurance claims workflows
- Financial validation logic
- Spring Transaction Management
- REST API development
- Data consistency
- Enterprise backend architecture
- Transaction status handling

---

## Author

Alhanoof Alabdullah
