package com.github.khalaimovda.bankapp.exchange.service;

import com.github.khalaimovda.bankapp.exchange.dto.Currency;
import com.github.khalaimovda.bankapp.exchange.dto.ExchangeRate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;

@Service
public class ExchangeServiceImpl implements ExchangeService {
    @Override
    public Flux<ExchangeRate> getExchangeRate() {
        return Flux.just(new ExchangeRate(Currency.EUR, Currency.RUB, BigDecimal.valueOf(90)));
    }
}
