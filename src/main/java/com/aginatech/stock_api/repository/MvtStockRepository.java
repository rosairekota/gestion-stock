package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.MvtSock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStockRepository extends JpaRepository<Integer, MvtSock> {
}
