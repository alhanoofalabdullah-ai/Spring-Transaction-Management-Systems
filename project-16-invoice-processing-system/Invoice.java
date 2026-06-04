package com.invoice;

import jakarta.persistence.*;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String invoiceNumber;

    private Double baseAmount;

    private Double taxRate;

    private Double totalAmount;

    private String status;

    public Invoice() {
    }

    public Invoice(String customerName,
                   String invoiceNumber,
                   Double baseAmount,
                   Double taxRate,
                   Double totalAmount,
                   String status) {
        this.customerName = customerName;
        this.invoiceNumber = invoiceNumber;
        this.baseAmount = baseAmount;
        this.taxRate = taxRate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Double getBaseAmount() {
        return baseAmount;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setBaseAmount(Double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
