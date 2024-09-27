package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Integer, Categorie> {
}
