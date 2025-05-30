package com.github.khalaimovda.bankapp.blocker.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class DepositOperationCheckRequest extends SuspicionCheckRequest {
    @NotNull
    @Min(1)
    private Integer accountId;

    @NotNull
    @DecimalMin(value = "0.01")
    private BigDecimal amount;
}
