package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeClientRepository extends JpaRepository<Integer, LigneCommandeClient> {
}
