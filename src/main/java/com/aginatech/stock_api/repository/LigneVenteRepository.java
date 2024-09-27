package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<Integer, LigneVente> {
}
