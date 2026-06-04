package com.procurement;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProcurementController {

    private final ProcurementService service;

    public ProcurementController(ProcurementService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Procurement Management System Running";
    }

    @PostMapping("/procurements")
    public Procurement createProcurement(
            @RequestBody ProcurementRequest request
    ) {
        return service.createProcurement(request);
    }

    @GetMapping("/procurements")
    public List<Procurement> getAllProcurements() {
        return service.getAllProcurements();
    }
}
