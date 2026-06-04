package com.refund;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RefundController {

    private final RefundService refundService;

    public RefundController(RefundService refundService) {
        this.refundService = refundService;
    }

    @GetMapping("/")
    public String home() {
        return "Refund Management Platform Running";
    }

    @PostMapping("/refunds")
    public Refund createRefund(
            @RequestBody RefundRequest request
    ) {
        return refundService.processRefund(request);
    }

    @GetMapping("/refunds")
    public List<Refund> getAllRefunds() {
        return refundService.getAllRefunds();
    }
}
