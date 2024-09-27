package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Integer, Fournisseur> {
}
