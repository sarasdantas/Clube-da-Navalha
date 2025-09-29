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
@Table(name = "usuario")

public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Nonnull
    private int id; 
    @Nonnull
    private String nome; 
    @Nonnull
    private String email; 
    @Nonnull   
    private boolean ativo; 

}
