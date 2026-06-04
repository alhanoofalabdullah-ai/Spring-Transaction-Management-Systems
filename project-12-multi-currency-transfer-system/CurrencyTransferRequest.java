package com.currency;

public class CurrencyTransferRequest {

    private String senderName;

    private String receiverName;

    private String sourceCurrency;

    private String targetCurrency;

    private Double amount;

    private Double exchangeRate;

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
}
