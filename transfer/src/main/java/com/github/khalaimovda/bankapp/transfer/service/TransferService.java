package com.github.khalaimovda.bankapp.transfer.service;

import com.github.khalaimovda.bankapp.transfer.dto.TransferRequest;
import reactor.core.publisher.Mono;

public interface TransferService {
    Mono<Void> transfer(TransferRequest request);
}
