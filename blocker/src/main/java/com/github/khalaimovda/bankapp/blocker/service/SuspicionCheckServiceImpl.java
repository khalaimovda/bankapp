package com.github.khalaimovda.bankapp.blocker.service;

import com.github.khalaimovda.bankapp.blocker.dto.*;
import com.github.khalaimovda.bankapp.contracts.dto.DepositOperation;
import com.github.khalaimovda.bankapp.contracts.dto.TransferOperation;
import com.github.khalaimovda.bankapp.contracts.dto.WithdrawalOperation;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SuspicionCheckServiceImpl implements SuspicionCheckService {
    @Override
    public Mono<CheckResult> check(TransferOperation operation) {
        return Mono.just(new CheckResult(CheckResultStatus.ALLOWED));
    }

    @Override
    public Mono<CheckResult> check(DepositOperation operation) {
        return Mono.just(new CheckResult(CheckResultStatus.ALLOWED));
    }

    @Override
    public Mono<CheckResult> check(WithdrawalOperation operation) {
        return Mono.just(new CheckResult(CheckResultStatus.ALLOWED));
    }
}
