package com.github.khalaimovda.bankapp.transfer.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record TransferRequest(
    @NotNull @Min(1) Integer fromAccountId,
    @NotNull @Min(1) Integer toAccountId,
    @NotNull @DecimalMin(value = "0.01") BigDecimal amount
) {}
