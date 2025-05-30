package com.github.khalaimovda.bankapp.contracts.dto;

import com.github.khalaimovda.bankapp.contracts.enums.Currency;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ExchangeRate(
    @NotNull Currency base,
    @NotNull Currency quote,
    @NotNull @DecimalMin(value = "0.01") BigDecimal rate
) {}
