package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeFournisseurRepository extends JpaRepository<Integer, CommandeFournisseur> {
}
