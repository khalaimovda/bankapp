package com.github.khalaimovda.bankapp.blocker.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TransferOperationCheckRequest extends SuspicionCheckRequest {
    @NotNull
    @Min(1)
    private Integer fromAccountId;

    @NotNull
    @Min(1)
    private Integer toAccountId;

    @NotNull
    @DecimalMin(value = "0.01")
    private BigDecimal amount;
}

