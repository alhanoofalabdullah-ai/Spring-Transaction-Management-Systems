package com.invoice;

public class InvoiceRequest {

    private String customerName;

    private String invoiceNumber;

    private Double baseAmount;

    private Double taxRate;

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
}
