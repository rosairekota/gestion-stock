package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "entreprise")
public class Entreprise extends BaseEntity{
    @Column
    private  String nom;

    @Column(nullable = true)
    private  String description;

    @Embedded
    private  Adresse adresse;

    @Column
    private  String email;

    @Column
    private  String telephone;

    @Column(name = "code_fiscal", nullable = true)
    private String codeFiscal;


    @Column(name = "site_web", nullable = true)
    private String siteWeb;

    @Column
    private  String photo;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
