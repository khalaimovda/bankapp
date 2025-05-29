package com.github.khalaimovda.bankapp.accounts.service;

import com.github.khalaimovda.bankapp.accounts.model.Account;
import reactor.core.publisher.Flux;

public interface AccountService {
    Flux<Account> getAccounts(int userId);
}
