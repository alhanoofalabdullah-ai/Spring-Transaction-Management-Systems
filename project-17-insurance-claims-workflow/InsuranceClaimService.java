package com.claims;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InsuranceClaimService {

    private final InsuranceClaimRepository repository;

    public InsuranceClaimService(InsuranceClaimRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public InsuranceClaim processClaim(InsuranceClaimRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getPolicyNumber() == null || request.getPolicyNumber().isBlank()) {
            throw new RuntimeException("Policy number is required");
        }

        if (request.getClaimAmount() == null || request.getClaimAmount() <= 0) {
            throw new RuntimeException("Claim amount must be greater than zero");
        }

        if (request.getClaimReason() == null || request.getClaimReason().isBlank()) {
            throw new RuntimeException("Claim reason is required");
        }

        String status;

        if (request.getClaimAmount() <= 15000) {
            status = "APPROVED";
        } else {
            status = "REJECTED";
        }

        InsuranceClaim claim = new InsuranceClaim(
                request.getCustomerName(),
                request.getPolicyNumber(),
                request.getClaimAmount(),
                request.getClaimReason(),
                status
        );

        return repository.save(claim);
    }

    public List<InsuranceClaim> getAllClaims() {
        return repository.findAll();
    }
}
