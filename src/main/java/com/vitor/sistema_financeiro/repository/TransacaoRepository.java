package com.vitor.sistema_financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vitor.sistema_financeiro.model.Transacao;



public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
