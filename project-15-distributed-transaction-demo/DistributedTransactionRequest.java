package com.distributed;

public class DistributedTransactionRequest {

    private String customerName;

    private String transactionType;

    private Double amount;

    private String sourceSystem;

    private String targetSystem;

    public String getCustomerName() {
        return customerName;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public String getTargetSystem() {
        return targetSystem;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public void setTargetSystem(String targetSystem) {
        this.targetSystem = targetSystem;
    }
}
