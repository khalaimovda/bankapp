package com.github.khalaimovda.bankapp.blocker.conrtoller;

import com.github.khalaimovda.bankapp.blocker.dto.CheckResult;
import com.github.khalaimovda.bankapp.blocker.service.SuspicionCheckService;
import com.github.khalaimovda.bankapp.contracts.dto.DepositOperation;
import com.github.khalaimovda.bankapp.contracts.dto.FinancialOperation;
import com.github.khalaimovda.bankapp.contracts.dto.TransferOperation;
import com.github.khalaimovda.bankapp.contracts.dto.WithdrawalOperation;
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
    public Mono<CheckResult> suspicionChecks(@Valid @RequestBody FinancialOperation operation) {
        // todo: Refactoring
        return switch (operation) {
            case TransferOperation transfer -> suspicionCheckService.check(transfer);
            case DepositOperation deposit -> suspicionCheckService.check(deposit);
            case WithdrawalOperation withdrawal -> suspicionCheckService.check(withdrawal);
        };
    }
}
