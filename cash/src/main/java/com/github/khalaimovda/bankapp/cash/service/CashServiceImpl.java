package com.github.khalaimovda.bankapp.cash.service;

import com.github.khalaimovda.bankapp.cash.dto.DepositRequest;
import com.github.khalaimovda.bankapp.cash.dto.WithdrawalRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CashServiceImpl implements CashService {
    @Override
    public Mono<Void> deposit(DepositRequest request) {
        return Mono.empty();
    }

    @Override
    public Mono<Void> withdrawal(WithdrawalRequest request) {
        return Mono.empty();
    }
}
