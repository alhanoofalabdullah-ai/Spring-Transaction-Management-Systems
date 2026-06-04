package com.subscription;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubscriptionService {

    private final SubscriptionRepository repository;

    public SubscriptionService(SubscriptionRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Subscription createSubscription(
            SubscriptionRequest request) {

        if (request.getCustomerName() == null ||
            request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getMonthlyFee() == null ||
            request.getMonthlyFee() <= 0) {
            throw new RuntimeException("Monthly fee must be greater than zero");
        }

        Subscription subscription = new Subscription(
                request.getCustomerName(),
                request.getPlanName(),
                request.getMonthlyFee(),
                "ACTIVE"
        );

        return repository.save(subscription);
    }

    public List<Subscription> getAllSubscriptions() {
        return repository.findAll();
    }
}
