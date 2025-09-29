package com.clubedanavalha.clubedanavalha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clubedanavalha.clubedanavalha.entities.NotificacaoEntity;

@Repository
public interface NotificacaoRepository extends JpaRepository<NotificacaoEntity, Integer>{

}
