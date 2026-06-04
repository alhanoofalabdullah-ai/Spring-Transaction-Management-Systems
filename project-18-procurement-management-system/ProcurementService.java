package com.procurement;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProcurementService {

    private final ProcurementRepository repository;

    public ProcurementService(ProcurementRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Procurement createProcurement(ProcurementRequest request) {

        if (request.getRequesterName() == null || request.getRequesterName().isBlank()) {
            throw new RuntimeException("Requester name is required");
        }

        if (request.getSupplierName() == null || request.getSupplierName().isBlank()) {
            throw new RuntimeException("Supplier name is required");
        }

        if (request.getItemName() == null || request.getItemName().isBlank()) {
            throw new RuntimeException("Item name is required");
        }

        if (request.getQuantity() == null || request.getQuantity() <= 0) {
            throw new RuntimeException("Quantity must be greater than zero");
        }

        if (request.getUnitPrice() == null || request.getUnitPrice() <= 0) {
            throw new RuntimeException("Unit price must be greater than zero");
        }

        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        String status;

        if (totalAmount <= 50000) {
            status = "APPROVED";
        } else {
            status = "REVIEW_REQUIRED";
        }

        Procurement procurement = new Procurement(
                request.getRequesterName(),
                request.getSupplierName(),
                request.getItemName(),
                request.getQuantity(),
                request.getUnitPrice(),
                totalAmount,
                status
        );

        return repository.save(procurement);
    }

    public List<Procurement> getAllProcurements() {
        return repository.findAll();
    }
}
