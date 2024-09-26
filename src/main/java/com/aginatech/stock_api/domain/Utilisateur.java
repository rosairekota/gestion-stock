package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "utilisateurs")
public class Utilisateur  extends BaseEntity{

    @Column
    private  String nom;

    @Column
    private  String prenom;

    @Column
    private  String email;

    @Column(name = "mot_de_passe")
    private  String motDePasse;

    @Column(name = "date_naissance")
    private Instant dateNaissance;

    @Column(nullable = true)
    private  String telephone;

    @Column(nullable = true)
    private  String photo;

    @Embedded
    private  Adresse  adresse;


    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private  Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;
}
