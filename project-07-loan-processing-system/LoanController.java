package com.loan;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/")
    public String home() {
        return "Loan Processing System Running";
    }

    @PostMapping("/loans")
    public Loan applyForLoan(@RequestBody LoanRequest request) {
        return loanService.processLoan(request);
    }

    @GetMapping("/loans")
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }
}
