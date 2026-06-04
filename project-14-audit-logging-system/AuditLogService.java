package com.audit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuditLogService {

    private final AuditLogRepository repository;

    public AuditLogService(AuditLogRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public AuditLog createAuditLog(AuditLogRequest request) {

        if (request.getUsername() == null || request.getUsername().isBlank()) {
            throw new RuntimeException("Username is required");
        }

        if (request.getActionType() == null || request.getActionType().isBlank()) {
            throw new RuntimeException("Action type is required");
        }

        if (request.getDescription() == null || request.getDescription().isBlank()) {
            throw new RuntimeException("Description is required");
        }

        if (request.getStatus() == null || request.getStatus().isBlank()) {
            throw new RuntimeException("Status is required");
        }

        AuditLog log = new AuditLog(
                request.getUsername(),
                request.getActionType(),
                request.getDescription(),
                request.getStatus()
        );

        return repository.save(log);
    }

    public List<AuditLog> getAllAuditLogs() {
        return repository.findAll();
    }
}
