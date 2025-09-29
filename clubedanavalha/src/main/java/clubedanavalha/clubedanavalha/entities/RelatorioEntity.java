package com.clubedanavalha.clubedanavalha.entities;

import java.sql.Date;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "relatorio")

public class RelatorioEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Nonnull
    private int id_relatorio;
    @Nonnull
    private String tipo;
    @Nonnull
    private Date periodo_inicio;
    @Nonnull
    private Date periodo_fim;
    @Nonnull
    private Date data_geracao;
    @Nonnull
    private String conteudo;
}
