package com.enterprise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseTransactionRepository extends JpaRepository<EnterpriseTransaction, Long> {
}
