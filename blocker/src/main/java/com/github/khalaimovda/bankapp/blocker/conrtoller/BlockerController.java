package com.github.khalaimovda.bankapp.blocker.conrtoller;

import com.github.khalaimovda.bankapp.blocker.dto.*;
import com.github.khalaimovda.bankapp.blocker.service.SuspicionCheckService;
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
public class BlockerController {

    private final SuspicionCheckService suspicionCheckService;

    @PostMapping("/suspicion-checks")
    @ResponseStatus(HttpStatus.OK)
    public Mono<CheckResult> suspicionChecks(@Valid @RequestBody SuspicionCheckRequest request) {
        // todo: Refactoring
        if (request instanceof TransferOperationCheckRequest) {
            return suspicionCheckService.check((TransferOperationCheckRequest) request);
        }
        if (request instanceof DepositOperationCheckRequest) {
            return suspicionCheckService.check((DepositOperationCheckRequest) request);
        }
        if (request instanceof WithdrawalOperationCheckRequest) {
            return suspicionCheckService.check((WithdrawalOperationCheckRequest) request);
        }
        throw new IllegalArgumentException("Unknown type: " + request.type);
    }
}
