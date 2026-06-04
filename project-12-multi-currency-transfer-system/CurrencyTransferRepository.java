package com.currency;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyTransferRepository extends JpaRepository<CurrencyTransfer, Long> {
}
