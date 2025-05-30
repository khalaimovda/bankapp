package com.github.khalaimovda.bankapp.exchange.controller;

import com.github.khalaimovda.bankapp.exchange.dto.ExchangeRate;
import com.github.khalaimovda.bankapp.exchange.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeService exchangeService;

    @GetMapping("/rate")
    public Flux<ExchangeRate> getExchangeRate() {
        // todo: add filters (?base= ?quote=)
        return exchangeService.getExchangeRate();
    }
}
