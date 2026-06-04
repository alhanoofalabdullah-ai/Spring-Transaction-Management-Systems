package com.healthcare;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HealthcareBillController {

    private final HealthcareBillService service;

    public HealthcareBillController(HealthcareBillService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Healthcare Billing System Running";
    }

    @PostMapping("/healthcare-bills")
    public HealthcareBill createBill(
            @RequestBody HealthcareBillRequest request
    ) {
        return service.createBill(request);
    }

    @GetMapping("/healthcare-bills")
    public List<HealthcareBill> getAllBills() {
        return service.getAllBills();
    }
}
