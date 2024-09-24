package com.aginatech.stock_api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Role extends BaseEntity{

    @Column(name = "role_name")
    private  String roleName; // roleName= pour permettre a spring de le reconnaitre

    @Column
    private  String slug;

    @ManyToMany(mappedBy = "roles")
    private  Utilisateur utilisateurs;
}
