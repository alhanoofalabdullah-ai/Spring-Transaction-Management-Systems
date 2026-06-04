package com.inventory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventoryService {

    private final ProductRepository repository;

    public InventoryService(ProductRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Product addStock(InventoryRequest request) {

        Product product = repository.findById(
                request.getProductId()
        ).orElseThrow();

        product.setStockQuantity(
                product.getStockQuantity() + request.getQuantity()
        );

        return repository.save(product);
    }

    @Transactional
    public Product removeStock(InventoryRequest request) {

        Product product = repository.findById(
                request.getProductId()
        ).orElseThrow();

        if(product.getStockQuantity() < request.getQuantity()) {
            throw new RuntimeException("Insufficient stock");
        }

        product.setStockQuantity(
                product.getStockQuantity() - request.getQuantity()
        );

        return repository.save(product);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }
}
