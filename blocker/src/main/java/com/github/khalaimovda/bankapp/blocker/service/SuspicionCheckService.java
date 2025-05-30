package com.github.khalaimovda.bankapp.blocker.service;

import com.github.khalaimovda.bankapp.blocker.dto.CheckResult;
import com.github.khalaimovda.bankapp.blocker.dto.DepositOperationCheckRequest;
import com.github.khalaimovda.bankapp.blocker.dto.TransferOperationCheckRequest;
import com.github.khalaimovda.bankapp.blocker.dto.WithdrawalOperationCheckRequest;
import reactor.core.publisher.Mono;

public interface SuspicionCheckService {
    Mono<CheckResult> check(TransferOperationCheckRequest request);
    Mono<CheckResult> check(DepositOperationCheckRequest request);
    Mono<CheckResult> check(WithdrawalOperationCheckRequest request);
}
