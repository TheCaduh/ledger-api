package com.eduardo_alves.ledger_api.dto;

import java.math.BigDecimal;

public record LancamentoRequest(BigDecimal valor, String tipo, String descricao) {
}
