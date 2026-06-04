package com.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiCurrencyTransferApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                MultiCurrencyTransferApplication.class,
                args
        );
    }
}
