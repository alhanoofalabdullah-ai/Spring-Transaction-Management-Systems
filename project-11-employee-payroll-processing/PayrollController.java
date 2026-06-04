package com.payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PayrollController {

    private final PayrollService service;

    public PayrollController(PayrollService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Employee Payroll Processing Running";
    }

    @PostMapping("/payroll")
    public Payroll processPayroll(
            @RequestBody PayrollRequest request
    ) {
        return service.processPayroll(request);
    }

    @GetMapping("/payroll")
    public List<Payroll> getAllPayrollRecords() {
        return service.getAllPayrollRecords();
    }
}
