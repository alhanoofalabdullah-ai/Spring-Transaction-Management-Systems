package com.wallet;

public class WalletRequest {

    private Long walletId;

    private Double amount;

    public Long getWalletId() {
        return walletId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
