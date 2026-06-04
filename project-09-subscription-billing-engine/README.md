# Subscription Billing Engine

Enterprise subscription billing system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how subscription-based platforms manage recurring billing operations while ensuring transaction consistency, payment validation, and reliable subscription lifecycle management.

The system simulates subscription creation, billing calculations, payment processing, and status tracking.

---

## Features

- Create subscriptions
- Calculate recurring billing amounts
- Process billing transactions
- Track subscription status
- Manage billing cycles
- Transaction consistency
- REST API integration

---

## Business Scenario

A customer subscribes to a service plan.

The system calculates the billing amount and processes the subscription payment.

If billing information is valid, the subscription becomes ACTIVE.

If billing validation fails, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Create Subscription

POST /subscriptions

### Get All Subscriptions

GET /subscriptions

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

- Subscription Billing Systems
- Recurring Payments
- Spring Transaction Management
- Enterprise Business Logic
- Financial Workflow Design
- REST API Development

---

## Author

Alhanoof Alabdullah
