package com.eduardo_alves.ledger_api.repository;

import com.eduardo_alves.ledger_api.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
