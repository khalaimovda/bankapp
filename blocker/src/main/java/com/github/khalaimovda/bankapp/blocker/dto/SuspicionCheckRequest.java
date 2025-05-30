package com.github.khalaimovda.bankapp.blocker.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = TransferOperationCheckRequest.class, name = "transfer"),
    @JsonSubTypes.Type(value = DepositOperationCheckRequest.class, name = "deposit"),
    @JsonSubTypes.Type(value = WithdrawalOperationCheckRequest.class, name = "withdrawal")
})
public abstract class SuspicionCheckRequest {
    @NotNull
    @NotEmpty
    public String type;
}
