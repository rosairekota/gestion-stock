package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "roles")
public class Role extends BaseEntity{

    @Column(name = "role_name")
    private  String roleName; // roleName= pour permettre a spring de le reconnaitre

    @Column
    private  String slug;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private  Utilisateur utilisateur;
}
