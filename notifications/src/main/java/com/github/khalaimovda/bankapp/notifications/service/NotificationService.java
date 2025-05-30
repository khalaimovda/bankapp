package com.github.khalaimovda.bankapp.notifications.service;

import com.github.khalaimovda.bankapp.contracts.dto.DepositOperation;
import com.github.khalaimovda.bankapp.contracts.dto.TransferOperation;
import com.github.khalaimovda.bankapp.contracts.dto.WithdrawalOperation;
import reactor.core.publisher.Mono;

public interface NotificationService {
    Mono<Void> notify(TransferOperation operation);
    Mono<Void> notify(DepositOperation operation);
    Mono<Void> notify(WithdrawalOperation operation);
}
