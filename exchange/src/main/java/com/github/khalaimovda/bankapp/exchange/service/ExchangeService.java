package com.github.khalaimovda.bankapp.exchange.service;

import com.github.khalaimovda.bankapp.contracts.dto.ExchangeRate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ExchangeService {
    Flux<ExchangeRate> getExchangeRate();
    Mono<Void> setExchangeRate( List<ExchangeRate> exchangeRates);
}
