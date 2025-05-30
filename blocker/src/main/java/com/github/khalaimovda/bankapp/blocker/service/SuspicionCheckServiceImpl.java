package com.github.khalaimovda.bankapp.blocker.service;

import com.github.khalaimovda.bankapp.blocker.dto.*;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SuspicionCheckServiceImpl implements SuspicionCheckService {
    @Override
    public Mono<CheckResult> check(TransferOperationCheckRequest request) {
        return Mono.just(new CheckResult(CheckResultStatus.ALLOWED));
    }

    @Override
    public Mono<CheckResult> check(DepositOperationCheckRequest request) {
        return Mono.just(new CheckResult(CheckResultStatus.ALLOWED));
    }

    @Override
    public Mono<CheckResult> check(WithdrawalOperationCheckRequest request) {
        return Mono.just(new CheckResult(CheckResultStatus.ALLOWED));
    }
}
