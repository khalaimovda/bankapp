package com.github.khalaimovda.bankapp.cash.service;

import com.github.khalaimovda.bankapp.cash.dto.DepositRequest;
import com.github.khalaimovda.bankapp.cash.dto.WithdrawalRequest;
import reactor.core.publisher.Mono;

public interface CashService {
    Mono<Void> deposit(DepositRequest request);
    Mono<Void> withdrawal(WithdrawalRequest request);
}
