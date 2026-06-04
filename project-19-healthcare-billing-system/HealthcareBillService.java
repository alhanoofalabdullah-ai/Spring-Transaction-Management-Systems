package com.healthcare;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HealthcareBillService {

    private final HealthcareBillRepository repository;

    public HealthcareBillService(HealthcareBillRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public HealthcareBill createBill(HealthcareBillRequest request) {

        if (request.getPatientName() == null || request.getPatientName().isBlank()) {
            throw new RuntimeException("Patient name is required");
        }

        if (request.getServiceName() == null || request.getServiceName().isBlank()) {
            throw new RuntimeException("Service name is required");
        }

        if (request.getServiceCost() == null || request.getServiceCost() <= 0) {
            throw new RuntimeException("Service cost must be greater than zero");
        }

        if (request.getInsuranceCoverage() == null || request.getInsuranceCoverage() < 0) {
            throw new RuntimeException("Insurance coverage cannot be negative");
        }

        if (request.getInsuranceCoverage() > request.getServiceCost()) {
            throw new RuntimeException("Insurance coverage cannot exceed service cost");
        }

        Double finalAmount = request.getServiceCost() - request.getInsuranceCoverage();

        HealthcareBill bill = new HealthcareBill(
                request.getPatientName(),
                request.getServiceName(),
                request.getServiceCost(),
                request.getInsuranceCoverage(),
                finalAmount,
                "ISSUED"
        );

        return repository.save(bill);
    }

    public List<HealthcareBill> getAllBills() {
        return repository.findAll();
    }
}
