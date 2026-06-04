package com.invoice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Invoice createInvoice(InvoiceRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getInvoiceNumber() == null || request.getInvoiceNumber().isBlank()) {
            throw new RuntimeException("Invoice number is required");
        }

        if (request.getBaseAmount() == null || request.getBaseAmount() <= 0) {
            throw new RuntimeException("Base amount must be greater than zero");
        }

        if (request.getTaxRate() == null || request.getTaxRate() < 0) {
            throw new RuntimeException("Tax rate cannot be negative");
        }

        Double totalAmount = request.getBaseAmount()
                + (request.getBaseAmount() * request.getTaxRate() / 100);

        Invoice invoice = new Invoice(
                request.getCustomerName(),
                request.getInvoiceNumber(),
                request.getBaseAmount(),
                request.getTaxRate(),
                totalAmount,
                "ISSUED"
        );

        return repository.save(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return repository.findAll();
    }
}
