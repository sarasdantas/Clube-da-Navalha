package com.clubedanavalha.clubedanavalha.services;

import org.springframework.stereotype.Service;

import com.clubedanavalha.clubedanavalha.repositories.ClienteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private ClienteRepository clienteRepository;
}
