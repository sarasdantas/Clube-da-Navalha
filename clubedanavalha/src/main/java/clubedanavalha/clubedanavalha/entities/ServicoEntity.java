package com.clubedanavalha.clubedanavalha.entities;

import java.math.BigDecimal;

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
@Table(name = "servico")

public class ServicoEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Nonnull
    private int id; 
    @Nonnull
    private String nome; 
    @Nonnull    
    private String tipo; 
    @Nonnull
    private int duracaoMinutos; 
    @Nonnull
    private BigDecimal preco; 
    @Nonnull
    private boolean ativo; 

}
