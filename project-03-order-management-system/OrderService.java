package com.order;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public Order createOrder(OrderRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getProductName() == null || request.getProductName().isBlank()) {
            throw new RuntimeException("Product name is required");
        }

        if (request.getQuantity() == null || request.getQuantity() <= 0) {
            throw new RuntimeException("Quantity must be greater than zero");
        }

        if (request.getUnitPrice() == null || request.getUnitPrice() <= 0) {
            throw new RuntimeException("Unit price must be greater than zero");
        }

        Double totalAmount = request.getQuantity() * request.getUnitPrice();

        Order order = new Order(
                request.getCustomerName(),
                request.getProductName(),
                request.getQuantity(),
                request.getUnitPrice(),
                totalAmount,
                "CONFIRMED"
        );

        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
