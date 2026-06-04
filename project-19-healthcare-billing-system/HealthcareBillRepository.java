package com.healthcare;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthcareBillRepository extends JpaRepository<HealthcareBill, Long> {
}
