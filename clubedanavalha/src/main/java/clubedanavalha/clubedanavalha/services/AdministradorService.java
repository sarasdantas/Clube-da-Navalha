package com.clubedanavalha.clubedanavalha.services;

import org.springframework.stereotype.Service;

import com.clubedanavalha.clubedanavalha.repositories.AdministradorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdministradorService {
    private AdministradorRepository administradorRepository;
}
