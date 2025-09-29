package com.clubedanavalha.clubedanavalha.services;

import org.springframework.stereotype.Service;

import com.clubedanavalha.clubedanavalha.repositories.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
}
