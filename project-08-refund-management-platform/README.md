# Refund Management Platform

Enterprise refund processing platform built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise applications process customer refunds while maintaining transaction consistency, financial integrity, and auditability.

The system simulates refund requests, validates refund eligibility, processes approved refunds, and stores refund transactions.

---

## Features

- Create refund requests
- Validate refund amount
- Approve or reject refunds
- Transaction consistency
- Automatic rollback support
- REST API integration
- Refund status tracking

---

## Business Scenario

A customer requests a refund.

If the refund amount is valid and within policy limits, the refund is approved and processed.

If the refund request is invalid, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Create Refund Request

POST /refunds

### Get All Refunds

GET /refunds

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

- Refund Processing
- Financial Transaction Workflows
- Spring Transaction Management
- REST API Development
- Data Consistency
- Enterprise Backend Design

---

## Author

Alhanoof Alabdullah
