package com.aginatech.stock_api.repository;

import com.aginatech.stock_api.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Integer, Role> {
}
