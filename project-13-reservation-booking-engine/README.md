# Reservation Booking Engine

Enterprise reservation booking system built using Spring Boot and Spring Transaction Management.

---

## Overview

This project demonstrates how enterprise booking systems process reservations while ensuring validation, transaction consistency, and reliable booking status management.

The system simulates a reservation workflow where a customer submits a booking request, the system validates the reservation details, calculates the total cost, and stores the booking with a confirmed status.

---

## Features

- Create reservation bookings
- Validate customer details
- Validate booking dates
- Calculate total booking cost
- Store reservation status
- Use Spring Transaction Management
- Return REST API responses

---

## Business Scenario

A customer books a service or room reservation.

If the booking details are valid, the reservation is stored with a `CONFIRMED` status.

If the reservation details are invalid, the transaction is rejected.

---

## API Endpoints

### Health Check

GET /

### Create Reservation

POST /reservations

Example Request:

```json
{
  "customerName": "Ahmad",
  "serviceName": "Hotel Room",
  "numberOfDays": 3,
  "dailyRate": 750
}
```

### Get All Reservations

GET /reservations

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

- Reservation workflow design
- Booking transaction handling
- Spring Transaction Management
- REST API development
- Data consistency
- Backend service architecture
- Enterprise system logic

---

## Author

Alhanoof Alabdullah
