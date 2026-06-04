package com.currency;

import jakarta.persistence.*;

@Entity
@Table(name = "currency_transfers")
public class CurrencyTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String senderName;

    private String receiverName;

    private String sourceCurrency;

    private String targetCurrency;

    private Double amount;

    private Double exchangeRate;

    private Double convertedAmount;

    private String status;

    public CurrencyTransfer() {
    }

    public CurrencyTransfer(String senderName,
                            String receiverName,
                            String sourceCurrency,
                            String targetCurrency,
                            Double amount,
                            Double exchangeRate,
                            Double convertedAmount,
                            String status) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.amount = amount;
        this.exchangeRate = exchangeRate;
        this.convertedAmount = convertedAmount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public Double getConvertedAmount() {
        return convertedAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setConvertedAmount(Double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
