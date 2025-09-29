package com.clubedanavalha.clubedanavalha.entities;

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
@Table(name = "profissionalServico")

public class ProfissionalServicoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Nonnull
    private int id_profissional_servico;
    @Nonnull
    private int profissional_id;
    @Nonnull
    private int servico_id;
    @Nonnull
    private boolean ativo;
}
