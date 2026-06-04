package com.distributed;

import jakarta.persistence.*;

@Entity
@Table(name = "distributed_transactions")
public class DistributedTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String transactionType;

    private Double amount;

    private String sourceSystem;

    private String targetSystem;

    private String status;

    public DistributedTransaction() {
    }

    public DistributedTransaction(String customerName,
                                  String transactionType,
                                  Double amount,
                                  String sourceSystem,
                                  String targetSystem,
                                  String status) {
        this.customerName = customerName;
        this.transactionType = transactionType;
        this.amount = amount;
        this.sourceSystem = sourceSystem;
        this.targetSystem = targetSystem;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

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

    public String getStatus() {
        return status;
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

    public void setStatus(String status) {
        this.status = status;
    }
}
