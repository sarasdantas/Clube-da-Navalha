package com.clubedanavalha.clubedanavalha.entities;

import java.sql.Date;
import java.sql.Time;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
//import jakarta.persistence.ForeignKey;
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
@Table(name="agendamento")


public class AgendamentoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Nonnull
    private int id; 

   // @ForeignKey
    @Nonnull
    private int clienteId; 
    
    @Nonnull
    private Date data; 

    @Nonnull
    private Time hora; 

    @Nonnull
    private String status; 

    @Nonnull
    private Date dataCriacao; 

    @Nonnull
    private int profissionalId; 

    @Nonnull
    private Date dataAtualizacao; 

    @Nonnull
    private String motivoCancelamento; 
    
    @Nonnull
    private int servicoId;
}
