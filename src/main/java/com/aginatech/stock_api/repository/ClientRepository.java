package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Integer, Client> {
}
