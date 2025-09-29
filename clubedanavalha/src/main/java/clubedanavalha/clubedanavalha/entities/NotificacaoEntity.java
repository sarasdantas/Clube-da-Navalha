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
@Table(name = "notificacao")

public class NotificacaoEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Nonnull
    private int id_notificacao;
    @Nonnull
    private String tipo;
    @Nonnull
    private String mensagem;
    @Nonnull
    private Date enviada_em;
    @Nonnull
    private int cliente_id;
    @Nonnull
    private int agendamento_id;

}
