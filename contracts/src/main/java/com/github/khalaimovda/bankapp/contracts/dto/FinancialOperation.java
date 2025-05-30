package com.github.khalaimovda.bankapp.contracts.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = TransferOperation.class, name = "transfer"),
    @JsonSubTypes.Type(value = DepositOperation.class, name = "deposit"),
    @JsonSubTypes.Type(value = WithdrawalOperation.class, name = "withdrawal")
})
@Getter
public sealed abstract class FinancialOperation permits TransferOperation, DepositOperation, WithdrawalOperation {
    @NotNull
    @NotEmpty
    private String type;
}
