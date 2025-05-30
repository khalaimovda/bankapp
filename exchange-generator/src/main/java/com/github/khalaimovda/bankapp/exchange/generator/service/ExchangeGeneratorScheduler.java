package com.github.khalaimovda.bankapp.exchange.generator.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExchangeGeneratorScheduler {

    @Scheduled(fixedRate = 3000)
    public void updateExchangeRate() {
        System.out.println("New exchange rate was sent to exchange microservice");
    }
}
