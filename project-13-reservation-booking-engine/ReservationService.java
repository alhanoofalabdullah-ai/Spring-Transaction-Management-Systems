package com.reservation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository repository;

    public ReservationService(ReservationRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Reservation createReservation(ReservationRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getServiceName() == null || request.getServiceName().isBlank()) {
            throw new RuntimeException("Service name is required");
        }

        if (request.getNumberOfDays() == null || request.getNumberOfDays() <= 0) {
            throw new RuntimeException("Number of days must be greater than zero");
        }

        if (request.getDailyRate() == null || request.getDailyRate() <= 0) {
            throw new RuntimeException("Daily rate must be greater than zero");
        }

        Double totalAmount = request.getNumberOfDays() * request.getDailyRate();

        Reservation reservation = new Reservation(
                request.getCustomerName(),
                request.getServiceName(),
                request.getNumberOfDays(),
                request.getDailyRate(),
                totalAmount,
                "CONFIRMED"
        );

        return repository.save(reservation);
    }

    public List<Reservation> getAllReservations() {
        return repository.findAll();
    }
}
