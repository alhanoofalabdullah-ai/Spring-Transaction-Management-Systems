package com.claims;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsuranceClaimController {

    private final InsuranceClaimService service;

    public InsuranceClaimController(InsuranceClaimService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Insurance Claims Workflow Running";
    }

    @PostMapping("/claims")
    public InsuranceClaim submitClaim(
            @RequestBody InsuranceClaimRequest request
    ) {
        return service.processClaim(request);
    }

    @GetMapping("/claims")
    public List<InsuranceClaim> getAllClaims() {
        return service.getAllClaims();
    }
}
