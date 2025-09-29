package com.clubedanavalha.clubedanavalha.services;

import org.springframework.stereotype.Service;
import com.clubedanavalha.clubedanavalha.repositories.ProfissionalServicoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfissionalServicoService {
    private ProfissionalServicoRepository profissionalServicoRepository;
}
