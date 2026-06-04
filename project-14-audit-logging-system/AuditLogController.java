package com.audit;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuditLogController {

    private final AuditLogService service;

    public AuditLogController(AuditLogService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Audit Logging System Running";
    }

    @PostMapping("/audit-logs")
    public AuditLog createAuditLog(
            @RequestBody AuditLogRequest request
    ) {
        return service.createAuditLog(request);
    }

    @GetMapping("/audit-logs")
    public List<AuditLog> getAllAuditLogs() {
        return service.getAllAuditLogs();
    }
}
