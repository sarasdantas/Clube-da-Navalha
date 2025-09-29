package com.clubedanavalha.clubedanavalha.entities;

import java.sql.Date;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
//@Table(name= "clliente")

public class ClienteEntity extends UsuarioEntity{
    @Nonnull
    private String telefone; 
    @Nonnull
    private Date dataCadastro; 
}
