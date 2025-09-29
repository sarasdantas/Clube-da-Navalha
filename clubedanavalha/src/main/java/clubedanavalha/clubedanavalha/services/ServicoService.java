package com.clubedanavalha.clubedanavalha.services;

import org.springframework.stereotype.Service;

import com.clubedanavalha.clubedanavalha.repositories.ServicoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServicoService {
    private ServicoRepository servicoRepository;
}
