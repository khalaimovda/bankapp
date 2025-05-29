package com.github.khalaimovda.bankapp.accounts.controller;

import com.github.khalaimovda.bankapp.accounts.model.Account;
import com.github.khalaimovda.bankapp.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping(path = "")
    public Flux<Account> getAccounts() {
        int userId = 13;
        return accountService.getAccounts(userId);
    }
}
