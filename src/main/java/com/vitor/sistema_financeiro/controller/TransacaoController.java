package com.vitor.sistema_financeiro.controller;

import com.vitor.sistema_financeiro.model.Transacao;
import com.vitor.sistema_financeiro.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/transacoes")

public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping
    public List<Transacao> listarTodas() {
        return transacaoRepository.findAll();
    }

    @PostMapping
    public Transacao criarTransacao(@Valid @RequestBody Transacao transacao) {
        return transacaoRepository.save(transacao);
    }


    @DeleteMapping("/{id}")
    public void deletarTransacao(@PathVariable Long id) {
        transacaoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Transacao atualizarTransacao(@PathVariable Long id, @RequestBody Transacao transacaoAtualizada) {
        return transacaoRepository.findById(id)
                .map(transacao -> {
                    transacao.setDescricao(transacaoAtualizada.getDescricao());
                    transacao.setValor(transacaoAtualizada.getValor());
                    transacao.setData(transacaoAtualizada.getData());
                    transacao.setTipo(transacaoAtualizada.getTipo());
                    return transacaoRepository.save(transacao);
                })
                .orElseThrow(() -> new RuntimeException("Transação não encontrada!"));
    }
}
