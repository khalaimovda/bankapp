package com.github.khalaimovda.bankapp.accounts.service;

import com.github.khalaimovda.bankapp.accounts.model.Account;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public Flux<Account> getAccounts(int userId) {
        return Flux.just(
            new Account(1, userId, BigDecimal.valueOf(123)),
            new Account(2, userId, BigDecimal.valueOf(234)),
            new Account(3, userId, BigDecimal.valueOf(345))
        );
    }
}
