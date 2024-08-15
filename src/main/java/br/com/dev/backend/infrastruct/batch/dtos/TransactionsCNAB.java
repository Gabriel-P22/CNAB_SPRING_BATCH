package br.com.dev.backend.infrastruct.batch.dtos;

import java.math.BigDecimal;

public record TransactionsCNAB(
        Integer type,
        String dates,
        BigDecimal amount,
        Long cpf,
        String card,
        String hours,
        String storeOwner,
        String storeName
) {}
