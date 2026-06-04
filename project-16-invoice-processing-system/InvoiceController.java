package com.invoice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {

    private final InvoiceService service;

    public InvoiceController(InvoiceService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Invoice Processing System Running";
    }

    @PostMapping("/invoices")
    public Invoice createInvoice(
            @RequestBody InvoiceRequest request
    ) {
        return service.createInvoice(request);
    }

    @GetMapping("/invoices")
    public List<Invoice> getAllInvoices() {
        return service.getAllInvoices();
    }
}
