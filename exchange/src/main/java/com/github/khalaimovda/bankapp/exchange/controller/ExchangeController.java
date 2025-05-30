package com.github.khalaimovda.bankapp.exchange.controller;

import com.github.khalaimovda.bankapp.contracts.dto.ExchangeRate;
import com.github.khalaimovda.bankapp.exchange.service.ExchangeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeService exchangeService;

    @GetMapping("/rate")
    public Flux<ExchangeRate> getExchangeRate() {
        // todo: add filters (?base= ?quote=)
        return exchangeService.getExchangeRate();
    }

    @PostMapping("/rate")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> setExchangeRate(@Valid @RequestBody List<ExchangeRate> exchangeRates) {
        // For exchange-generator
        return exchangeService.setExchangeRate(exchangeRates);
    }
}
