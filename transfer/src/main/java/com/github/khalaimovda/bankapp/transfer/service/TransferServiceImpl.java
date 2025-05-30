package com.github.khalaimovda.bankapp.transfer.service;

import com.github.khalaimovda.bankapp.transfer.dto.TransferRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TransferServiceImpl implements TransferService {
    @Override
    public Mono<Void> transfer(TransferRequest request) {
        return Mono.empty();
    }
}
