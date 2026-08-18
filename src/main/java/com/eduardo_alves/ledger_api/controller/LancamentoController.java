package com.eduardo_alves.ledger_api.controller;

import com.eduardo_alves.ledger_api.dto.LancamentoRequest;
import com.eduardo_alves.ledger_api.service.LancamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {
    private final LancamentoService lancamentoService;

public LancamentoController(LancamentoService lancamentoService) {
        this.lancamentoService = lancamentoService;
    }


    @PostMapping
    public ResponseEntity criarLancamento(@RequestBody LancamentoRequest request) {

        // 1. O Recepcionista passa a bola para o Especialista (O Service)
        lancamentoService.processarLancamento(request);

        // 2. (Opcional) A Prova de vida no console
        System.out.println(request);

        // 3. A Resposta de Sucesso para o Postman
        return ResponseEntity.status(HttpStatus.CREATED).body(request);
    }
}
