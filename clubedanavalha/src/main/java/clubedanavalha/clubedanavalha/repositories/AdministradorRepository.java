package com.clubedanavalha.clubedanavalha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clubedanavalha.clubedanavalha.entities.AdministradorEntity;

@Repository
public interface AdministradorRepository extends JpaRepository<AdministradorEntity, Integer> {

}
