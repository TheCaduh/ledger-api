package com.eduardo_alves.ledger_api.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeErros {
    @ExceptionHandler
    public ResponseEntity tratarErroDeValidacao(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body("Erro de validação: " + ex.getMessage());
    }
}
