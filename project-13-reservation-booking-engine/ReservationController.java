package com.reservation;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Reservation Booking Engine Running";
    }

    @PostMapping("/reservations")
    public Reservation createReservation(
            @RequestBody ReservationRequest request
    ) {
        return service.createReservation(request);
    }

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        return service.getAllReservations();
    }
}
