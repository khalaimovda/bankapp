package com.github.khalaimovda.bankapp.notifications.controller;

import com.github.khalaimovda.bankapp.contracts.dto.DepositOperation;
import com.github.khalaimovda.bankapp.contracts.dto.FinancialOperation;
import com.github.khalaimovda.bankapp.contracts.dto.TransferOperation;
import com.github.khalaimovda.bankapp.contracts.dto.WithdrawalOperation;
import com.github.khalaimovda.bankapp.notifications.service.NotificationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> notify(@Valid @RequestBody FinancialOperation operation) {
        // todo: Refactoring
        return switch (operation) {
            case TransferOperation transfer -> notificationService.notify(transfer);
            case DepositOperation deposit -> notificationService.notify(deposit);
            case WithdrawalOperation withdrawal -> notificationService.notify(withdrawal);
        };
    }
}
