package com.refund;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RefundService {

    private final RefundRepository repository;

    public RefundService(RefundRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Refund processRefund(RefundRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getRefundAmount() == null || request.getRefundAmount() <= 0) {
            throw new RuntimeException("Refund amount must be greater than zero");
        }

        String status;

        if (request.getRefundAmount() <= 5000) {
            status = "APPROVED";
        } else {
            status = "REJECTED";
        }

        Refund refund = new Refund(
                request.getCustomerName(),
                request.getRefundAmount(),
                request.getReason(),
                status
        );

        return repository.save(refund);
    }

    public List<Refund> getAllRefunds() {
        return repository.findAll();
    }
}
