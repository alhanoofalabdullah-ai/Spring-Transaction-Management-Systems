package com.checkout;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CheckoutService {

    private final CheckoutRepository repository;

    public CheckoutService(CheckoutRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Checkout processCheckout(CheckoutRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getOrderNumber() == null || request.getOrderNumber().isBlank()) {
            throw new RuntimeException("Order number is required");
        }

        if (request.getAmount() == null || request.getAmount() <= 0) {
            throw new RuntimeException("Checkout amount must be greater than zero");
        }

        if (request.getPaymentMethod() == null || request.getPaymentMethod().isBlank()) {
            throw new RuntimeException("Payment method is required");
        }

        Checkout checkout = new Checkout(
                request.getCustomerName(),
                request.getOrderNumber(),
                request.getAmount(),
                request.getPaymentMethod(),
                "COMPLETED"
        );

        return repository.save(checkout);
    }

    public List<Checkout> getAllCheckouts() {
        return repository.findAll();
    }
}
