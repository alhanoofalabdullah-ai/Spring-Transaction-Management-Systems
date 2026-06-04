package com.procurement;

public class ProcurementRequest {

    private String requesterName;

    private String supplierName;

    private String itemName;

    private Integer quantity;

    private Double unitPrice;

    public String getRequesterName() {
        return requesterName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
