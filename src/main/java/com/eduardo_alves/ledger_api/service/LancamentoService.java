package com.eduardo_alves.ledger_api.service;

import com.eduardo_alves.ledger_api.dto.LancamentoRequest;
import com.eduardo_alves.ledger_api.model.Lancamento;
import com.eduardo_alves.ledger_api.repository.LancamentoRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LancamentoService {
    public LancamentoService(LancamentoRepository repository) {
        this.repository = repository;
    }

    private final LancamentoRepository repository;
    public LancamentoRequest processarLancamento(LancamentoRequest request) {
        // 1. Verificamos se o valor é menor ou igual a zero
        if (request.valor().compareTo(BigDecimal.ZERO) <= 0) {
            // Se for, nós "estouramos" um erro e paramos a execução na hora
            throw new IllegalArgumentException("O valor do lançamento deve ser maior que zero.");
        }

// 2. Se passar pelo if (ou seja, for um valor positivo), nós simplesmente devolvemos o objeto

        Lancamento newLancamento = new Lancamento();
        newLancamento.setValor(request.valor());
        newLancamento.setTipo(request.tipo());
        newLancamento.setDescricao(request.descricao());
        repository.save(newLancamento);
        return request;
    }
}
