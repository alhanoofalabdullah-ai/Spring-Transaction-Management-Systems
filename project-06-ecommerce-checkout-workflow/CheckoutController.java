package com.checkout;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @GetMapping("/")
    public String home() {
        return "E-Commerce Checkout Workflow Running";
    }

    @PostMapping("/checkout")
    public Checkout processCheckout(@RequestBody CheckoutRequest request) {
        return checkoutService.processCheckout(request);
    }

    @GetMapping("/checkouts")
    public List<Checkout> getAllCheckouts() {
        return checkoutService.getAllCheckouts();
    }
}
