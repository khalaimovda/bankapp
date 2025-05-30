package com.github.khalaimovda.bankapp.blocker.service;

import com.github.khalaimovda.bankapp.blocker.dto.CheckResult;
import com.github.khalaimovda.bankapp.contracts.dto.DepositOperation;
import com.github.khalaimovda.bankapp.contracts.dto.TransferOperation;
import com.github.khalaimovda.bankapp.contracts.dto.WithdrawalOperation;
import reactor.core.publisher.Mono;

public interface SuspicionCheckService {
    Mono<CheckResult> check(TransferOperation operation);
    Mono<CheckResult> check(DepositOperation operation);
    Mono<CheckResult> check(WithdrawalOperation operation);
}
