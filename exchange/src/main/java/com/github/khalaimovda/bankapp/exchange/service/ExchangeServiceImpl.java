package com.github.khalaimovda.bankapp.exchange.service;

import com.github.khalaimovda.bankapp.contracts.dto.ExchangeRate;
import com.github.khalaimovda.bankapp.contracts.enums.Currency;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService {
    @Override
    public Flux<ExchangeRate> getExchangeRate() {
        return Flux.just(new ExchangeRate(Currency.EUR, Currency.RUB, BigDecimal.valueOf(90)));
    }

    @Override
    public Mono<Void> setExchangeRate(List<ExchangeRate> exchangeRates) {
        return Mono.empty();
    }
}
