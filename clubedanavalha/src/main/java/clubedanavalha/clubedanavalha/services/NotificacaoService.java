package com.clubedanavalha.clubedanavalha.services;

import org.springframework.stereotype.Service;

import com.clubedanavalha.clubedanavalha.repositories.NotificacaoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificacaoService {
    private NotificacaoRepository notificacaoRepository;
}
