package com.github.khalaimovda.bankapp.transfer.controller;

import com.github.khalaimovda.bankapp.transfer.dto.TransferRequest;
import com.github.khalaimovda.bankapp.transfer.service.TransferService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class TransferController {

    private final TransferService transferService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> transfer(@Valid @RequestBody TransferRequest request) {
        return transferService.transfer(request);
    }
}
