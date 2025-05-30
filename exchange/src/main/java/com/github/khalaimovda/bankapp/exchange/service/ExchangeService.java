package com.github.khalaimovda.bankapp.exchange.service;

import com.github.khalaimovda.bankapp.exchange.dto.ExchangeRate;
import reactor.core.publisher.Flux;

public interface ExchangeService {
    Flux<ExchangeRate> getExchangeRate();
}
