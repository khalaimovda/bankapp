package com.github.khalaimovda.bankapp.cash.controller;

import com.github.khalaimovda.bankapp.cash.dto.DepositRequest;
import com.github.khalaimovda.bankapp.cash.dto.WithdrawalRequest;
import com.github.khalaimovda.bankapp.cash.service.CashService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class CashController {

    private final CashService cashService;

    @PostMapping("/deposit")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> deposit(@Valid @RequestBody DepositRequest request) {
        return cashService.deposit(request);
    }

    @PostMapping("/withdrawal")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> withdrawal(@Valid @RequestBody WithdrawalRequest request) {
        return cashService.withdrawal(request);
    }
}
