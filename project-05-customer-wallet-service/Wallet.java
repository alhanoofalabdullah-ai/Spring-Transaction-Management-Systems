package com.wallet;

import jakarta.persistence.*;

@Entity
@Table(name = "wallets")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private Double balance;

    public Wallet() {
    }

    public Wallet(String customerName, Double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
