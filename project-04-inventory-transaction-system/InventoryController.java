package com.inventory;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(
            InventoryService inventoryService
    ) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/")
    public String home() {
        return "Inventory Transaction System Running";
    }

    @PostMapping("/inventory/add")
    public Product addStock(
            @RequestBody InventoryRequest request
    ) {
        return inventoryService.addStock(request);
    }

    @PostMapping("/inventory/remove")
    public Product removeStock(
            @RequestBody InventoryRequest request
    ) {
        return inventoryService.removeStock(request);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return inventoryService.getProducts();
    }
}
