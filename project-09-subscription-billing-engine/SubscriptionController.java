package com.subscription;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(
            SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping("/")
    public String home() {
        return "Subscription Billing Engine Running";
    }

    @PostMapping("/subscriptions")
    public Subscription createSubscription(
            @RequestBody SubscriptionRequest request) {
        return subscriptionService.createSubscription(request);
    }

    @GetMapping("/subscriptions")
    public List<Subscription> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }
}
