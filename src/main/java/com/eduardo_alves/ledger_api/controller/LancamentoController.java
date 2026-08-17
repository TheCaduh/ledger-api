package com.eduardo_alves.ledger_api.controller;

import com.eduardo_alves.ledger_api.dto.LancamentoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {


    @PostMapping
    public ResponseEntity criarLancamento(@RequestBody LancamentoRequest request) {
        System.out.println(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(request);
    }
}
