package com.vitor.sistema_financeiro.model;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "transacoes")

public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @NotBlank(message = "A descrição é Obrigatória")
    private String descricao;

    @NotNull(message = "O valor não pode ser Nulo")
    @Positive(message = "O valor deve ser maior que zero")
    private Double valor;

    @NotNull(message = "A data é Obrigatória")
    @PastOrPresent(message = "A data deve ser no passado")
    private LocalDate data;

    @NotNull(message = "O tipo é Obrigatório")
    @Enumerated(EnumType.STRING)
    private TipoTransacao tipo;

    public Transacao() {
    }

    public Transacao(Long id, String descricao, Double valor, LocalDate data) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

}
