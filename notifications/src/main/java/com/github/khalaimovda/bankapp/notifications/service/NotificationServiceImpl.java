package com.github.khalaimovda.bankapp.notifications.service;

import com.github.khalaimovda.bankapp.contracts.dto.DepositOperation;
import com.github.khalaimovda.bankapp.contracts.dto.TransferOperation;
import com.github.khalaimovda.bankapp.contracts.dto.WithdrawalOperation;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public Mono<Void> notify(TransferOperation operation) {
        return Mono.empty();
    }

    @Override
    public Mono<Void> notify(DepositOperation operation) {
        return Mono.empty();
    }

    @Override
    public Mono<Void> notify(WithdrawalOperation operation) {
        return Mono.empty();
    }
}
