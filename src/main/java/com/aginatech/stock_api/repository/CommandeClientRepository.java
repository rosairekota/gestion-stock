package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
