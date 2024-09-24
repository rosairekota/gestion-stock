package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends BaseEntity {

    @Column
    private  String nom;

    @Column
    private  String prenom;

    @Embedded
    private  Adresse adresse;

    @Column
    private  String telephone;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;
}
