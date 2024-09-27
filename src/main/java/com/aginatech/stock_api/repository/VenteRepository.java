package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Integer, Vente> {
}
