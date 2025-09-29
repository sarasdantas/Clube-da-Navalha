package com.clubedanavalha.clubedanavalha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clubedanavalha.clubedanavalha.entities.ProfissionalServicoEntity;

@Repository
public interface ProfissionalServicoRepository extends JpaRepository<ProfissionalServicoEntity, Integer> {

}
