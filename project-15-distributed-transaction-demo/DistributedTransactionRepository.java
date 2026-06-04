package com.distributed;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DistributedTransactionRepository extends JpaRepository<DistributedTransaction, Long> {
}
