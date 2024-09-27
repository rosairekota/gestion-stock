package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Integer, Entreprise> {
}
