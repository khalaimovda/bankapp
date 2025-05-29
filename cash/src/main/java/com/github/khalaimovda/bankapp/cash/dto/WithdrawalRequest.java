package com.github.khalaimovda.bankapp.cash.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record WithdrawalRequest(
    @NotNull Integer accountId,
    @NotNull @DecimalMin(value = "0.01") BigDecimal amount
) {}
